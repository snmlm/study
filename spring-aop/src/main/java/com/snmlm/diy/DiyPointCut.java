package com.snmlm.diy;

import org.aspectj.lang.ProceedingJoinPoint;

import java.lang.reflect.Method;

/**
 * @author: snmlm
 * @create: 2021-05-11
 */
public class DiyPointCut {
    public void before(){
        System.out.println("方法前执行");
    }
    public void after(){
        System.out.println("方法后执行");
    }
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        Object result = jp.proceed();
        System.out.println("环绕后");
    }
}
