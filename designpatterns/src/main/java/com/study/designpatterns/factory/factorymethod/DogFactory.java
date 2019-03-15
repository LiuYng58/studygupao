package com.study.designpatterns.factory.factorymethod;

import com.study.designpatterns.factory.Dog;
import com.study.designpatterns.factory.IAnimal;

public class DogFactory implements IAnimalFactory {
    @Override
    public IAnimal create() {
        return new Dog();
    }
}
