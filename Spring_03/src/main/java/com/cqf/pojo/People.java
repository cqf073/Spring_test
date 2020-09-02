package com.cqf.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/8/2610:16
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class People {
    @Autowired
    private  Dog dog;
    @Autowired
    private  Cat cat;

    private  String  name;

    public People() {
    }

    @Override
    public String toString() {
        return "People{" +
                "dog=" + dog +
                ", cat=" + cat +
                ", name='" + name + '\'' +
                '}';
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
