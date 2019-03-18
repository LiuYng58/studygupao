package com.study.designpatterns.singleton.lazy;


/**
 * 懒汉模式  使用double-check的方式 但是因为指令重排可能会有线程安全问题
 */
public class LazyExample3 {
    private LazyExample3() {}

    private static LazyExample3 lazy = null;

    public  static LazyExample3 getInstance(){
        if(null == lazy){
            synchronized(LazyExample3.class) {
                if (null == lazy) {
                    lazy = new LazyExample3();
                }
            }
        }
        return lazy;
    }
}
