package com.atguigu.springboot01helloworldquick.config;


import com.atguigu.springboot01helloworldquick.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 指名当前类是一个配置类，替代之前写bean的配置类文件（是类配置到ioc容器中）
 * <bean id="name"   class="......."></bean>添加组件
 */
@Configuration
public class myAppConfig {

    @Bean
    public HelloService helloService01(){
        return new HelloService();
    }
}
