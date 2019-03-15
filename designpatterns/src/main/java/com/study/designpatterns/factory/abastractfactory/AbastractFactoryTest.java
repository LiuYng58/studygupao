package com.study.designpatterns.factory.abastractfactory;

public class AbastractFactoryTest {
    public static void main(String[] args) {
        ICourseFactory javaCourse = new JavaCourseFactory();
        javaCourse.createNote().write();
        javaCourse.createCourse().record();
        javaCourse.createVideo().transcribe();
        ICourseFactory pythonCourse = new PythonCourseFactory();
        pythonCourse.createNote().write();
        pythonCourse.createCourse().record();
        pythonCourse.createVideo().transcribe();
    }
}
