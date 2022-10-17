package com.itheima.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.Filter;


//web配置类简化开发(代替web.xml)，仅设置配置类类名即可
public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    //加载springmvc配置类，产生springmvc容器（本质还是spring容器）
    protected Class<?>[] getServletConfigClasses() {

        return new Class[]{SpringMvcConfig.class};
    }
    //加载spring配置类
    protected Class<?>[] getRootConfigClasses() {

        return new Class[]{SpringConfig.class};
    }
    //设置由springmvc控制器处理的请求映射路径
    protected String[] getServletMappings() {

        return new String[]{"/"};
    }

    //乱码处理(post方式)--------get方式已被tomcat8配置好
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        return new Filter[]{filter};
    }
}
/*

public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
     //加载springmvc配置类，产生springmvc容器（本质还是spring容器）
    protected WebApplicationContext createServletApplicationContext() {
        //初始化WebApplicationContext对象
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        //加载指定配置类
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }
    protected WebApplicationContext createRootApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringConfig.class);
        return ctx;
    }
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
*/
