package com.cqf.DIY;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/9/117:15
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
@Aspect
public class MethodAnnoution {
    @Before("execution(* com.cqf.service.UserServiceImpl.*(..))")
    public void  before(){
        System.out.println("brfore");
    }
    @After("execution(* com.cqf.service.UserServiceImpl.*(..))")
    public  void  after(){
        System.out.println("After");
    }
    //在环绕的时候需要给定一个参数代表我们需要环绕的点
    @Around("execution(* com.cqf.service.UserServiceImpl.*(..))")
    public  void  around(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("before-around");
        joinPoint.proceed();
        System.out.println("After-around");

    }

}
