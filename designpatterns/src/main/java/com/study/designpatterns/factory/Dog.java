package com.study.designpatterns.factory;

public class Dog implements IAnimal {
    @Override
    public void printName() {
        System.out.println("This is a dog");
    }
}
