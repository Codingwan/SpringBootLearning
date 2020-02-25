package com.example.springboot02.controller;

import com.example.springboot02.dao.DepartmentDao;
import com.example.springboot02.dao.EmployeeDao;
import com.example.springboot02.entities.Department;
import com.example.springboot02.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.Date;

@Controller
public class employeeController {

    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    DepartmentDao departmentDao;
    @GetMapping("/emps")
    //查询所有的员工信息
    public String list(Model model){
        Collection<Employee> employees = employeeDao.getAll();
        //放在请求域中
        model.addAttribute("emps",employees);
        //thymeleaf默认就回拼串
        return "emp/list";
    }


    //来到员工添加页面
    @RequestMapping("/emp")
    public String toAddEmp(Model model){
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String execAddEmp(Employee employee){
        System.out.println(employee);
        employeeDao.save(employee);
        return "redirect:emps";
    }
}
