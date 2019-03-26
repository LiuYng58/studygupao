package com.study.designpatterns.singleton.threadlocal;

/**
 * 只是当前线程安全，不同线程可以创建不同的实例
 */
public class ThreadLocalExample1 {
    private ThreadLocalExample1(){}

    private static final ThreadLocal<ThreadLocalExample1> threadLocalInstance = new ThreadLocal<ThreadLocalExample1>(){
        @Override
        protected ThreadLocalExample1 initialValue() {
            return new ThreadLocalExample1();
        }
    };

    public static ThreadLocalExample1 getInstance(){
        return threadLocalInstance.get();
    }
}
