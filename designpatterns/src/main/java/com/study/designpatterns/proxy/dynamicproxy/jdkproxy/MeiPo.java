package com.study.designpatterns.proxy.dynamicproxy.jdkproxy;

import com.study.designpatterns.proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MeiPo implements InvocationHandler {
    private Person target;

    public Object getInstance(Person person){
        this.target = person;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    private void before(){
        System.out.println("收到你的要求");
        System.out.println("开始找对象");
    }

    private void after(){
        System.out.println("是否满意");
    }
}
