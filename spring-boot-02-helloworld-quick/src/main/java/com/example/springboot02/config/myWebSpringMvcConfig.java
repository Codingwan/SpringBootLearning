package com.example.springboot02.config;

import com.example.springboot02.component.LoginHandlerInterceptor;
import com.example.springboot02.component.myResolveLocale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
//自己在写配置类的时候记得加上注解，springboot 是一个开箱即用的工具， 减少配置文件的写入，如果需要写
//需要写配置主要是写在配置类中，记得加上注解，不然不会启用
public class myWebSpringMvcConfig extends WebMvcConfigurerAdapter {


    @Bean
    public LocaleResolver localeResolver(){
        return new myResolveLocale();
    }



    @Bean
    public WebMvcConfigurerAdapter  webMvcConfigurerAdapter() {
        WebMvcConfigurerAdapter webMvcConfigurerAdapter = new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/user/main.html").setViewName("dashboard");
            }

            //添加拦截器的配置
            //关闭拦截器
            /*@Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                        .excludePathPatterns("/index.html","/","/user/login");
            }*/
        };
        return webMvcConfigurerAdapter;
    }

}
