package com.example.springboot02.controller;


import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class loginController {


    @PostMapping(value = "/user/login")
//    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    public String toDashboard(@RequestParam("username") String username,
                              @RequestParam("password")String password,
                              Map<String,Object> map, HttpSession httpSession){

        if(!StringUtils.isEmpty(username)&&"123456".equals(password)){
            httpSession.setAttribute("username",username);
            return "redirect:main.html";
        }else {
            //登录失败
            map.put("msg","用户名密码错误");
            return "login";
        }

    }
}
