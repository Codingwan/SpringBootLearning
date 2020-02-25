package com.example.spring.service;

import com.example.spring.bean.Employee;
import com.example.spring.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

@CacheConfig(cacheNames = "emp")
@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;


    /*
    *   #id 和写#a0的效果是一样的,a0表示参数中的第一个
    * */
    @Cacheable(value = {"emp"},keyGenerator = "myKeyGenerator"/*,condition="#id>1"*/)
    public Employee getEmp(Integer id){
        System.out.println("查询"+id+"号员工");
        Employee emp = employeeMapper.getEmpById(id);
        return emp;
    }

    @CachePut(value = {"emp"},key = "#result.id")/*
        更新数据的时候也更新缓存里面的内容
    */
    public Employee updateEmp(Employee employee){
        employeeMapper.updateEmp(employee);
        return employee;
    }

    @CacheEvict(value="emp",beforeInvocation = true/*key = "#id",*/)
    public void deleteEmp(Integer id){
        System.out.println("deleteEmp:"+id);
        //employeeMapper.deleteEmpById(id);
        int i = 10/0;
    }


    /*
    * 三个的组合，应对复杂的缓存规则
    *
    * */
   /* @Caching(
            cacheable = {
                    @Cacheable(*//*value="emp",*//*key = "#lastName")
            },
            put = {
                    @CachePut(*//*value="emp",*//*key = "#result.id"),
                    @CachePut(*//*value="emp",*//*key = "#result.email")
            }
    )*/
    /*public Employee getEmpByLastName(String lastName){
        return employeeMapper.getEmpByLastName(lastName);
    }*/
}
