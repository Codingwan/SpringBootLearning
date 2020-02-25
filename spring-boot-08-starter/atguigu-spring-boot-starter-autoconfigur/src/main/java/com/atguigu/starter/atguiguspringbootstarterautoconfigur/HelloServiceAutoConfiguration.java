package com.atguigu.starter.atguiguspringbootstarterautoconfigur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(HelloPropertites.class)
public class HelloServiceAutoConfiguration {

    @Autowired
    HelloPropertites helloPropertites;

    @Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        helloService.setHelloPropertites(helloPropertites);
        return helloService;

    }
}
