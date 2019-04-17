package com.study.designpatterns.proxy.dbroute.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler {
    Object objectProxy;
    public Object getInstance(Object objectProxy){
        this.objectProxy = objectProxy;
        Class<?> aClass = objectProxy.getClass();
        return Proxy.newProxyInstance(aClass.getClassLoader(),aClass.getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(objectProxy, args);
        after();
        return invoke;
    }

    private void before(){
        System.out.println("动态代理之前");
    }
    private void after(){
        System.out.println("动态代理之后");
    }
}
