package com.study.designpatterns.factory.abastractfactory;

public class JavaNote implements INote {
    @Override
    public void write() {
        System.out.println("开始写Java笔记");
    }
}
