package com.study.designpatterns.factory.abastractfactory;

public class PythonVideo implements IVideo {
    @Override
    public void transcribe() {
        System.out.println("开始录制Python视频");
    }
}
