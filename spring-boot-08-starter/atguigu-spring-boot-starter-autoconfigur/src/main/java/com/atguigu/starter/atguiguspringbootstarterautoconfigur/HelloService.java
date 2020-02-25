package com.atguigu.starter.atguiguspringbootstarterautoconfigur;

public class HelloService {

    HelloPropertites helloPropertites;
    public String sayHelloAtguigu(String name ){

        return helloPropertites.getPrefix()+"-"+name +"-"+helloPropertites.getSuffix();
    }

    public HelloPropertites getHelloPropertites() {
        return helloPropertites;
    }

    public void setHelloPropertites(HelloPropertites helloPropertites) {
        this.helloPropertites = helloPropertites;
    }
}
