package com.atguigu.springboot01helloworldquick;

import com.atguigu.springboot01helloworldquick.model.person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


@SpringBootTest
class SpringBoot01HelloworldQuickApplicationTests {

    @Autowired
    person ps;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void helloServiceTest(){
        boolean b = ioc.containsBean("helloService01");
        System.out.println(b);
    }

    @Test
    void contextLoads() {
        System.out.println(ps);
    }

}
