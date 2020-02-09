package com.sonnguyen.webdochoioto.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.sonnguyen.webdochoioto.validator.UserValidator;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.nguyenson")
@PropertySource(value= {"classpath:db.properties"})
@EnableTransactionManagement
public class SpringConfig implements WebMvcConfigurer{
	
	@Autowired
	private Environment envi;
	
	
	@Bean(name="multipartResolver")
	public MultipartResolver multipartResolver() {
		CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver();
		multipartResolver.setMaxUploadSize(-1);
		return multipartResolver;
	}
	
	
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource=new ReloadableResourceBundleMessageSource();
		messageSource.addBasenames("classpath:messages");
		return messageSource;
	}
	
	@Bean
	public UserValidator userValidator() {
		return new UserValidator();
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName(envi.getProperty("db.driver"));
		dataSource.setUrl(envi.getProperty("db.url"));
		dataSource.setUsername(envi.getProperty("db.username"));
		dataSource.setPassword(envi.getProperty("db.password"));
		return dataSource;
	}
	
	@Bean
	LocalSessionFactoryBean  entityManagerFactoryBean() {
		LocalSessionFactoryBean  bean=new LocalSessionFactoryBean();
		bean.setDataSource(dataSource());
		bean.setPackagesToScan("com.nguyenson.entity");
		
		
		Properties properties=new Properties();
		properties.put("hibernate.dialect", envi.getProperty("hibernate.dialect"));
		properties.put("hibernate.show_sql", true);
		
		bean.setHibernateProperties(properties);
		return bean;
	}
	
	
	@Bean(name="transactionManager")
	@Autowired
	public HibernateTransactionManager hibernateTransactionManager(SessionFactory sessionFactory) {
		return new HibernateTransactionManager(sessionFactory);
	}
}
