package com.study.designpatterns.factory.factorymethod;


import com.study.designpatterns.factory.ICourse;

public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory courseFactory = new JavaCourseFactory();
        ICourse course = courseFactory.create();
        course.record();

        IAnimalFactory iAnimalFactory = new CatFactory();
        iAnimalFactory.create().printName();
    }
}
