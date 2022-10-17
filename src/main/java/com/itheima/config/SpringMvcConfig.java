package com.itheima.config;

import com.itheima.controller.interceptor.ProjectInterceptor;
import com.itheima.controller.interceptor.ProjectInterceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

//springmvc配置类，本质上还是一个spring配置类
@Configuration
@ComponentScan({"com.itheima.controller"})
//开启json数据类型自动转换成对象
@EnableWebMvc
@Import({SpringMvcSupport.class})

public class SpringMvcConfig  {




}