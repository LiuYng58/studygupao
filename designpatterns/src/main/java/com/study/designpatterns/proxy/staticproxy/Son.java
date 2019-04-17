package com.study.designpatterns.proxy.staticproxy;

import com.study.designpatterns.proxy.Person;

public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("儿子要求:白富美");
    }
}
