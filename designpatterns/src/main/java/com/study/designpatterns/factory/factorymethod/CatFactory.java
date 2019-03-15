package com.study.designpatterns.factory.factorymethod;

import com.study.designpatterns.factory.Cat;
import com.study.designpatterns.factory.IAnimal;

public class CatFactory implements IAnimalFactory {
    @Override
    public IAnimal create() {
        return new Cat();
    }
}
