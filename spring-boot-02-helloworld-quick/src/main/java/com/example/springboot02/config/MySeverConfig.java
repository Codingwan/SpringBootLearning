package com.example.springboot02.config;

import com.example.springboot02.filter.MyFilter;
import com.example.springboot02.servlet.MyServlet;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.Arrays;

@Configuration
public class MySeverConfig {

    /*注册三大组件*/
    @Bean
    public ServletRegistrationBean<MyServlet> myServletRegistrationBean(){
        ServletRegistrationBean<MyServlet> servletRegistrationBean= new ServletRegistrationBean<>(new MyServlet(),"/myServlet");
        servletRegistrationBean.setLoadOnStartup(1);//设置启动顺序
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean<Filter> myfilter(){
        FilterRegistrationBean<Filter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setFilter(new MyFilter());
        filterFilterRegistrationBean.setUrlPatterns(Arrays.asList("/hello","/myServlet"));
        return filterFilterRegistrationBean;
    }

    /*配置servlet容器*/
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer(){
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>(){
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                factory.setPort(8083);
            }

        };
    }
}
