package com.study.designpatterns.proxy.staticproxy;

import com.study.designpatterns.proxy.Person;

public class Father {

    private Person person;

    public Father(Person person) {
        this.person = person;
    }

    public void findLove(){
        System.out.println("父亲物色对象");
        person.findLove();
    }
}
