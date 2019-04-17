package com.study.designpatterns.proxy.dynamicproxy.jdkproxy;

import com.study.designpatterns.proxy.Person;

public class JDKProxyTest {
    public static void main(String[] args) {
        Person person = (Person) new MeiPo().getInstance(new Girl());
        person.findLove();
    }
}
