package com.study.designpatterns.singleton.hungry;

/**
 * 饿汉模式 使用静态代码块
 */
public class HungryExample2 {
    private HungryExample2(){}

    private static final HungryExample2 hungry;
    static {
        hungry = new HungryExample2();
    }
    public static HungryExample2 getInstance(){
        return hungry;
    }
}
