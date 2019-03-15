package com.study.designpatterns.factory.factorymethod;

import com.study.designpatterns.factory.ICourse;
import com.study.designpatterns.factory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
