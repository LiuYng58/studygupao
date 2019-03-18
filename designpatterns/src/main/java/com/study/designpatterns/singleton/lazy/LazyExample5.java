package com.study.designpatterns.singleton.lazy;


/**
 * 懒汉模式  使用静态内部类实现
 */
public class LazyExample5 {
    private LazyExample5() {
        //防止使用反射方式破坏单例
        if(null != LazyHolder.LAZY){
            throw new RuntimeException("不容许创建多个实例");
        }
    }


    public static final LazyExample5 getInstance(){
        return LazyHolder.LAZY;
    }

    private static class LazyHolder {
        private static final LazyExample5 LAZY = new LazyExample5();
    }

    /**
     * 防止使用序列化方式破坏单例
     * @return
     */
    private Object readResolve(){
        return LazyHolder.LAZY;
    }
}
