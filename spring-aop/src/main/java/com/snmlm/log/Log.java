package com.snmlm.log;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.adapter.AfterReturningAdviceInterceptor;

import java.lang.reflect.Method;

/**
 * @author: snmlm
 * @create: 2021-05-11
 */
public class Log implements MethodBeforeAdvice,AfterReturningAdvice {

    @Override
    /**
     * method：目标方法
     * objects：参数
     * o：目标对象
     */
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName()+"的"+method.getName()+"被执行了！");
    }

    @Override
    /**
     * o：返回值
     * method：目标方法
     * objects：参数
     * o1：目标对象
     */
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println(o1.getClass().getName()+"的"+method.getName()+"被执行了！并返回了："+o);
    }
}
