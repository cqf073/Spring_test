package com.cqf.dao;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/8/2510:29
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class hello {
    private  String  name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "hello{" +
                "name='" + name + '\'' +
                '}';
    }
}
