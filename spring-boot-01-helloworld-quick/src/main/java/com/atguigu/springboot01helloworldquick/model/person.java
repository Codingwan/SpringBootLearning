package com.atguigu.springboot01helloworldquick.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@PropertySource(value = {"classpath:otherConfiguration.properties"})
@Component
@ConfigurationProperties(prefix = "person")
public class person {

    private String name;
    private String age;
    private boolean staff;
    private dog g;
    private Map map;
    private List list;



    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", staff=" + staff +
                ", g=" + g +
                ", map=" + map +
                ", list=" + list +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean isStaff() {
        return staff;
    }

    public void setStaff(boolean staff) {
        this.staff = staff;
    }

    public dog getG() {
        return g;
    }

    public void setG(dog g) {
        this.g = g;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
