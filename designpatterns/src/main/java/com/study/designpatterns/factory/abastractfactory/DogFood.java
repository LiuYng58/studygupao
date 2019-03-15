package com.study.designpatterns.factory.abastractfactory;

public class DogFood implements IFood {
    @Override
    public void printName() {
        System.out.println("狗吃馒头");
    }
}
