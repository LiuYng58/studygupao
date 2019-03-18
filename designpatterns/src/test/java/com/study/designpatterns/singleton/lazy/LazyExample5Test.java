package com.study.designpatterns.singleton.lazy;


public class LazyExample5Test {
    public static void main(String[] args) {
        LazyExample5 lazy = LazyExample5.getInstance();
        System.out.println(lazy);
    }
}