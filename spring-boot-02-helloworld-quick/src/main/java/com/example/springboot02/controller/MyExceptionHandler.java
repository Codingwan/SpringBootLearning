package com.example.springboot02.controller;


import com.example.springboot02.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {

    /*返回json定制数据*/
   /* @ResponseBody
    @ExceptionHandler(UserNotExistException.class)
    public Map<String,Object> handleExcption(Exception e){

        Map<String,Object> map =new HashMap<>();
        map.put("code","user.notexist");
        map.put("message",e.getMessage());
        return map;
    }*/

    @ExceptionHandler(UserNotExistException.class)
    public String handleExcption(Exception e){

        Map<String,Object> map =new HashMap<>();
        map.put("code","user.notexist");
        map.put("message",e.getMessage());
        //返回的是时候 转发
        return "forword:/error";
    }
}
