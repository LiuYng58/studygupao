package com.study.designpatterns.factory.abastractfactory;

public class JavaVideo implements IVideo {
    @Override
    public void transcribe() {
        System.out.println("开始录制Java视频");
    }
}
