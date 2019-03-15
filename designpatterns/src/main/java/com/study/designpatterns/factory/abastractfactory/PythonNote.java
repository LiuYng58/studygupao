package com.study.designpatterns.factory.abastractfactory;

public class PythonNote implements INote {
    @Override
    public void write() {
        System.out.println("开始写Python笔记");
    }
}
