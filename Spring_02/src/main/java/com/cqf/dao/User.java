package com.cqf.dao;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/8/269:38
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class User {
    private  String name;
    private  int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
