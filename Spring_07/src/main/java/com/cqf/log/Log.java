package com.cqf.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/8/3118:45
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class Log implements MethodBeforeAdvice{
   //执行目标对象的方法  args参数  target执行的对象
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("______________");
        System.out.println("before");
        System.out.println(target.getClass().getName()+"的"+method.getName());
    }
}
