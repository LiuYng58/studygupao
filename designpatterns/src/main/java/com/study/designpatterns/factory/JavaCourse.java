package com.study.designpatterns.factory;

public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("已购买Java课程！");
    }
}
