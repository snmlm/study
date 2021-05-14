package com.snmlm.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author: snmlm
 * @create: 2021-05-11
 */
@Aspect //标志为切面
public class AnnotationPointCut {
    @Before("execution(* com.snmlm.service.impl.*.*(..))")
    public void before(){
        System.out.println("方法前执行");
    }
    @After("execution(* com.snmlm.service.impl.*.*(..))")
    public void after(){
        System.out.println("方法后执行");
    }
    @Around("execution(* com.snmlm.service.impl.*.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        Object result = jp.proceed();
        System.out.println("环绕后");
    }
}
