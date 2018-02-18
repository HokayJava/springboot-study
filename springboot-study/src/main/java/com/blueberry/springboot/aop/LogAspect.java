package com.blueberry.springboot.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

/**
 * @author hekai
 * @create 2018-02-17-21:03
 */
@Aspect
@Component
public class LogAspect {


    @Before("execution(* com.blueberry.springboot.aop..*Service.*(..))")
    protected void log() {
        System.out.println("=======before=======" + AopContext.currentProxy().getClass());
    }

    @After("execution(* com.blueberry.springboot.aop..*Service.*(..))")
    public void afterLog(JoinPoint joinPoint) {
        System.out.println("=======afterLog=======:" + joinPoint.getTarget().getClass().getName());
        System.out.println(joinPoint.getArgs());
    }
}