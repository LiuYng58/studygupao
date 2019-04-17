package com.study.designpatterns.proxy.dynamicproxy.jdkproxy;

import com.study.designpatterns.proxy.Person;

public class Girl implements Person {

    @Override
    public void findLove() {
        System.out.println("高富帅");
    }
}
