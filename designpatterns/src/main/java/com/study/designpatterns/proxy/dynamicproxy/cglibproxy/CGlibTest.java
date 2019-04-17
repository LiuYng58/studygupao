package com.study.designpatterns.proxy.dynamicproxy.cglibproxy;

import com.study.designpatterns.proxy.Person;
import com.study.designpatterns.proxy.dynamicproxy.jdkproxy.Girl;

public class CGlibTest {
    public static void main(String[] args) {
        Person person = (Person)new CGlibMeipo().getInstance(Girl.class);
        person.findLove();
        Customer customer = (Customer)new CGlibMeipo().getInstance(Customer.class);
        customer.findLove();
    }
}
