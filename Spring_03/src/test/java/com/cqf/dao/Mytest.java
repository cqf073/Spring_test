package com.cqf.dao;

import com.cqf.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/8/2610:21
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class Mytest {
    @Test
    public  void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        People people = context.getBean("people", People.class);
        people.getCat().action();
        people.getDog().action();
    }
}
