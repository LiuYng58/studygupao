package com.study.designpatterns.factory.factorymethod;


import com.study.designpatterns.factory.ICourse;
import com.study.designpatterns.factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
