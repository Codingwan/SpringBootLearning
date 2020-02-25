package com.example.spring.service;

import com.example.spring.bean.Department;
import com.example.spring.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DeptService {

    @Autowired
    DepartmentMapper departmentMapper;

    @Cacheable(value = "dept")
    public Department getById(Integer id){
        Department dept = departmentMapper.getDeptById(id);
        System.out.println("zxy");
        return dept;
    }
}
