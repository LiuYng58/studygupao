package com.study.designpatterns.singleton.register;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

import static org.junit.jupiter.api.Assertions.*;

class RegisterExample1Test {

    @Test
    void getInstance() {
        try{
            /*Class c = RegisterExample1.class;
            Constructor declaredConstructor = c.getDeclaredConstructor(String.class, int.class);
            declaredConstructor.setAccessible(true);
            RegisterExample1 instance = (RegisterExample1)declaredConstructor.newInstance("C",1);
            System.out.println(instance);*/
            RegisterExample1 instance1 = RegisterExample1.INSTANCE;
            System.out.println(instance1);
            System.out.println(RegisterExample1.getInstance());
            System.out.println(RegisterExample1.getInstance());
            System.out.println(RegisterExample1.getInstance());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}