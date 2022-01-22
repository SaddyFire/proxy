package com.itheima.pros;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHander implements InvocationHandler {

    private Object target;

    public MyHander(Object target) {
        this.target = target;
    }

    //对目标方法进行加强
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("工作之前。。");
        method.invoke(target,args);
        System.out.println("工作之后。。");
        return null;
    }
}
