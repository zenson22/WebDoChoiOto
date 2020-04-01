package com.sonnguyen.webdochoioto.config;

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

import com.sonnguyen.webdochoioto.security.CustomSuccessHandler;
import com.sonnguyen.webdochoioto.service.impl.CustomUserDetailsService;


@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{

	
	@Autowired
	private CustomUserDetailsService userDetailsService;
	
	@Autowired
	private CustomSuccessHandler customSuccessHandler;

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		
		http.authorizeRequests().antMatchers("/quan-tri/**").hasRole("ADMIN");
		http.authorizeRequests().antMatchers("/user/**").hasRole("USER").//
		anyRequest().permitAll();
		
		http.exceptionHandling().accessDeniedPage("/accessDenied");
		
		http.formLogin().loginPage("/dang-nhap").//
		loginProcessingUrl("/j_spring_security_check").//
		usernameParameter("j_username").//
		passwordParameter("j_password").//
		failureUrl("/dang-nhap?incorrectAccount").//
		defaultSuccessUrl("/trang-chu");//
		http.rememberMe().authenticationSuccessHandler(customSuccessHandler);
		http.sessionManagement().invalidSessionUrl("/dang-nhap?sessionTimeout");
		http.logout().logoutUrl("/thoat").//
		deleteCookies("JSESSIONID");
		
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**","/files/**");
	}
}
