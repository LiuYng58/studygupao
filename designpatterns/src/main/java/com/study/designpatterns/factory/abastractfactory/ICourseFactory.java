package com.study.designpatterns.factory.abastractfactory;


import com.study.designpatterns.factory.ICourse;

public interface ICourseFactory {
    ICourse createCourse();
    INote createNote();
    IVideo createVideo();
}
