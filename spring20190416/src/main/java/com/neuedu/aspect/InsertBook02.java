package com.neuedu.aspect;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component/* 1： 生成对象*/
@Aspect/*2：作为切面*/
public class InsertBook02 {
    /*3：切入点：使用的方法上配置切入点*/
    @Pointcut("execution(* com.neuedu.pojo.Book02.*(..))")
    public void mypointcut(){}

    /*4:通知配置到切入点上，value:切入点的方法名*/

    @Before("mypointcut()")
    public  void  create(){
        System.out.println("创建时间："+System.currentTimeMillis());
    }

    @After("mypointcut()")
    public void destroy(){
        System.out.println("失效时间："+System.currentTimeMillis());
    }
}
