package com.study.designpatterns.factory.abastractfactory;

public class CatFactory implements IAnimalFactory {
    @Override
    public IFood createFood() {
        return new CatFood();
    }
}
