/** 
 * Project Name:demo 
 * File Name:MyMvcConfig.java 
 * Package Name:com.lee.config 
 * Date:2022/11/0911:52:05 
 * Copyright (c) 2022, taoge@tmd.me All Rights Reserved. 
 * 
 */  
package com.lee.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/** 
 * ClassName:MyMvcConfig <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2022/11/09 11:52:05 <br/> 
 * @author   LeeUn 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// TODO Auto-generated method stub  
		WebMvcConfigurer.super.addViewControllers(registry);  
		registry.addViewController("/").setViewName("login");
		registry.addViewController("/login.html").setViewName("login");
		registry.addViewController("/index.html").setViewName("index");
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/index.html","/","/login","/css/*","/js/*","/font/*","/image/*","/picture/*"); 
	}
	
}
