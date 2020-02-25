package com.example.springboot.controller;

import com.example.springboot.service.AyncService;
import com.example.springboot.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AyncController {

    @Autowired
    AyncService ayncService;

    @Autowired
    ScheduleService scheduleService;
    @ResponseBody
    @GetMapping("/aync")
    public String ayncController() throws InterruptedException {
        //ayncService.ayncMethod();
        scheduleService.hello();
        return "success";
    }
}
