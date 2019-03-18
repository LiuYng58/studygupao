package com.study.designpatterns.singleton.lazy;





/**
 * 懒汉模式 使用synchronized关键字保证线程安全
 */
public class LazyExample2 {
    private LazyExample2() {}

    private static LazyExample2 lazy = null;

    public synchronized static LazyExample2 getInstance(){
        if(null == lazy){
            lazy = new LazyExample2();
        }
        return lazy;
    }
}
