package com.study.designpatterns.prototype;

public class Client {

    public Prototype startClone(Prototype prototype){
        return prototype.clone();
    }
}
