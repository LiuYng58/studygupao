package com.study.designpatterns.proxy.dynamicproxy.gpproxy;
import com.study.designpatterns.proxy.Person;
import java.lang.reflect.*;
public class $Proxy0 implements  Person{
    GPInvocationHandler h;
    public  $Proxy0(GPInvocationHandler h) {
        this.h = h;
    }
    public void findLove() {
        try {
            Method m = Person.class.getMethod("findLove");
            this.h.invoke(this,m,null);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}