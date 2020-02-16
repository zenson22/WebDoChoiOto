package com.sonnguyen.webdochoioto.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{

	
	@Autowired
	private DataSource dataSource;
	

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource).
		usersByUsernameQuery("SELECT USERNAME,PASSWORD,STATUS FROM USERS WHERE USERNAME = ? ").//
		authoritiesByUsernameQuery("SELECT USERNAME,ROLE FROM USERS WHERE USERNAME = ?").//
		passwordEncoder(passwordEncoder());//
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		
		http.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN");
		http.authorizeRequests().antMatchers("/user/**").hasRole("USER").//
		anyRequest().permitAll();
		
		http.formLogin().loginPage("/dang-nhap").//
		loginProcessingUrl("/login").//
		usernameParameter("j_username").//
		passwordParameter("j_password").//
		failureUrl("/dang-nhap?error=failed").//
		defaultSuccessUrl("/danh-sach-san-pham");
		
		http.exceptionHandling().accessDeniedPage("/dang-nhap?error=denied");
		http.rememberMe().rememberMeParameter("re");
		http.logout().logoutUrl("/logout");
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**","/files/**");
	}
}
