package com.study.designpatterns.factory;

public class Cat implements IAnimal {
    @Override
    public void printName() {
        System.out.println("This is a cat");
    }
}
