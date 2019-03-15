package com.study.designpatterns.factory.simplefactory;

import com.study.designpatterns.factory.Dog;
import com.study.designpatterns.factory.IAnimal;
import com.study.designpatterns.factory.ICourse;
import com.study.designpatterns.factory.JavaCourse;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        ICourse course = courseFactory.create(JavaCourse.class);
        course.record();

        AnimalFactory animalFactory = new AnimalFactory();
        IAnimal iAnimal = animalFactory.create(Dog.class);
        iAnimal.printName();
    }
}
