package com.study.designpatterns.factory.simplefactory;

import com.study.designpatterns.factory.IAnimal;

/**
 * 简单工厂模式
 */
public class AnimalFactory {
    public IAnimal create(Class clazz){
        try{
            if(null != clazz){
                return (IAnimal) clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
