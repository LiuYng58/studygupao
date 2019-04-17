package com.study.designpatterns.proxy.staticproxy;

public class FatherTest {
    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
