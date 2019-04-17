package com.study.designpatterns.proxy.dynamicproxy.gpproxy;

import com.study.designpatterns.proxy.Person;

import java.lang.reflect.Method;

public class GPMeipo implements GPInvocationHandler{
    private Object target;

    public Object getInstance(Object person){
        this.target = person;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
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
