package com.cqf.dao;

import com.cqf.Config.myConfig;
import com.cqf.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/8/279:24
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class Mytest {
    @Test
    public void  test(){
        ApplicationContext Context = new AnnotationConfigApplicationContext(myConfig.class);
       User getuser = (User)Context.getBean("getuser");
        System.out.println(getuser);

    }
}
