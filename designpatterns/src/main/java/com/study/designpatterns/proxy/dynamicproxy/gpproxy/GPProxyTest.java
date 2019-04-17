package com.study.designpatterns.proxy.dynamicproxy.gpproxy;

import com.study.designpatterns.proxy.Person;
import com.study.designpatterns.proxy.dynamicproxy.jdkproxy.Girl;

public class GPProxyTest {
    public static void main(String[] args) {
        Person person = (Person) new GPMeipo().getInstance(new Girl());
        person.findLove();
    }
}
