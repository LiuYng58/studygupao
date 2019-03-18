package com.study.designpatterns.singleton.lazy;


/**
 * 懒汉模式  使用double-check的方式 添加volatile关键字禁止指令重排
 */
public class LazyExample4 {
    private LazyExample4() {}

    private volatile static LazyExample4 lazy = null;

    public  static LazyExample4 getInstance(){
        if(null == lazy){
            synchronized(LazyExample4.class) {
                if (null == lazy) {
                    lazy = new LazyExample4();
                }
            }
        }
        return lazy;
    }
}
