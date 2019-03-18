package com.study.designpatterns.singleton.lazy;





/**
 * 懒汉模式 线程不安全
 */
public class LazyExample1 {
    private LazyExample1() {}

    private static LazyExample1 lazy = null;

    public static LazyExample1 getInstance(){
        if(null == lazy){
            lazy = new LazyExample1();
        }
        return lazy;
    }
}
