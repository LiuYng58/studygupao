package com.study.designpatterns.factory.simplefactory;

import com.study.designpatterns.factory.ICourse;
import com.study.designpatterns.factory.JavaCourse;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
//        ICourse course = courseFactory.create("com.example.factory.JavaCourse");
        ICourse course = courseFactory.create(JavaCourse.class);
        course.record();
    }
}
