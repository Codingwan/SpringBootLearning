package com.example.springboot.mapper;


import com.example.springboot.bean.Department;
import org.apache.ibatis.annotations.*;


public interface DepartmentMapper {

    @Select("select * from department where id =#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set department_name=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
