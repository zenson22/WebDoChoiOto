package com.sonnguyen.webdochoioto.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.sonnguyen.webdochoioto.validator.CategoryValidator;
import com.sonnguyen.webdochoioto.validator.ProductValidator;
import com.sonnguyen.webdochoioto.validator.UserValidator;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.sonnguyen.webdochoioto")

public class SpringConfig implements WebMvcConfigurer{
	
	
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
	public ProductValidator productValidator() {
		return new ProductValidator();
	}
	
	@Bean
	public CategoryValidator categoryValidator() {
		return new CategoryValidator();
	}
}