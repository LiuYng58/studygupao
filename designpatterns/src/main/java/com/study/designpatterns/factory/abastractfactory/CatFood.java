package com.study.designpatterns.factory.abastractfactory;

public class CatFood implements IFood {
    @Override
    public void printName() {
        System.out.println("猫吃鱼");
    }
}
