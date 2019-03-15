package com.study.designpatterns.factory.factorymethod;

import com.study.designpatterns.factory.IAnimal;

/**
 * 工厂方法模式
 */
public interface IAnimalFactory {
    IAnimal create();
}
