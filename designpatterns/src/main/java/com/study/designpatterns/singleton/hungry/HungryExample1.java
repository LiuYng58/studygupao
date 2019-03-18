package com.study.designpatterns.singleton.hungry;

/**
 * 饿汉模式
 */
public class HungryExample1 {
    private HungryExample1(){}

    private static final HungryExample1 hungry = new HungryExample1();

    public static HungryExample1 getInstance(){
        return hungry;
    }
}
