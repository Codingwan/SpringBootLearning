package com.example.springboot;

import com.example.springboot.bean.Book;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class SpringbootAmqpApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Test
    void contextLoads() {

        Map<String,Object> map = new HashMap<>();
        map.put("msg","这是第一个消息");
        map.put("data", Arrays.asList("helloworld",123,true));
        rabbitTemplate.convertAndSend("test.fanout","test.fanout",map);
    }

    @Test
    void receiveMsg(){
        Object o =  rabbitTemplate.receiveAndConvert("test");
        System.out.println(o);
    }
    @Test
    void sendBook(){
        rabbitTemplate.convertAndSend("test.fanout","",new Book("xiyouji","吴承恩"));
    }
}
