package com.study.designpatterns.factory;

public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("已购买Python课程！");
    }
}
