package com.study.designpatterns.factory.abastractfactory;

public class DogFactory implements IAnimalFactory {
    @Override
    public IFood createFood() {
        return new DogFood();
    }
}
