package com.example.dubbo.user.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    @Reference
    TicketService ticketService;

    public String hello(){
        String ticket = ticketService.buy();
        System.out.println("买到票了："+ticket);
        return ticket;
    }


}
