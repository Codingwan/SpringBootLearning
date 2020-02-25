package com.example.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hellojsp(Model model){
        model.addAttribute("msg","你好，悦悦");
        return "success";
    }
}
