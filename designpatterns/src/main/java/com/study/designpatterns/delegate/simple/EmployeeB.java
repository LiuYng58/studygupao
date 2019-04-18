package com.study.designpatterns.delegate.simple;

public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工A我擅长架构");
    }
}
