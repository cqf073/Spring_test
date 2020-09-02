package com.cqf.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/8/279:22
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/

//等价于在xml里面创建的bean
    @Component
public class User {

    private String name;

    public String getName() {
        return name;
    }
    @Value("123123")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
