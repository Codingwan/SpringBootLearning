package com.example.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/*
* 搭建基本环境
* 1.导入数据库文件，创建出department和employee表
* 2.创建javaBean封装数据
*
* 3.整合Mybatis操作数据库
*   1.配置数据源信息
*   2.是用注解版的Mybatis
*       1）MapperScan指定需要烧面的mapper接口所在的包
*       2）
* */
@MapperScan(value = "com.example.spring.mapper")
@SpringBootApplication
@EnableCaching
public class SpringBoot09CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot09CacheApplication.class, args);
    }

}
