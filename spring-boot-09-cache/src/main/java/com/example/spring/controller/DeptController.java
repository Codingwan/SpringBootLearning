package com.example.spring.controller;

import com.example.spring.bean.Department;
import com.example.spring.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DeptController {

    @Autowired
    DeptService deptService;

    @ResponseBody
    @GetMapping("/dept/{id}")
    public Department getById(@PathVariable("id")Integer id){
        Department byId = deptService.getById(id);
        return byId;
    }
}
