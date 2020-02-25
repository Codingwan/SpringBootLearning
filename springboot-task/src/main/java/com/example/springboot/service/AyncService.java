package com.example.springboot.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AyncService {


    @Async
    public void ayncMethod() throws InterruptedException {
        System.out.println("程序正在执行。。。1111111");
        Thread.sleep(3000);
        System.out.println("程序正在执行。。。2222222");
    }
}
