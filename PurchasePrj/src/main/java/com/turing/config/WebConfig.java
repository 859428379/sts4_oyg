package com.turing.config;

import javax.servlet.Filter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.turing.interceptor.LoginInterceptor;

@Configuration//配置类
public class WebConfig implements WebMvcConfigurer {
	
	//配置过滤器解决 客户端 http>put/delete方法
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public FilterRegistrationBean<Filter> testFilterRegistration() {
		FilterRegistrationBean  registration = new FilterRegistrationBean(new HiddenHttpMethodFilter());
		registration.addUrlPatterns("/*"); 
		registration.setName("hiddenHttpMethodFilter");
		return registration;
	}
	
	//添加视图映射(地址-模板)
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
		registry.addViewController("/mater").setViewName("pclass_select");
		registry.addViewController("/order").setViewName("Order_newform");
	}
	
/*	//注册拦截器
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor())
		.addPathPatterns("/**")
		.excludePathPatterns("/","/login","/css/**","/js/**");
	}*/
	
	
}
