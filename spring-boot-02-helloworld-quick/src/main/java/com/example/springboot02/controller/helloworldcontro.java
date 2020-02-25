package com.example.springboot02.controller;


import com.example.springboot02.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloworldcontro {

   /* @RequestMapping({"/","/index.html"})
    public String index(){
        return "login";
    }*/



    @ResponseBody
    @RequestMapping("/hello")
    public String hellocontroller(@RequestParam("user") String user){
        if(user.equals("aaa")){
            throw new UserNotExistException();
        }
        return "hello,world!!!";
    }



}
