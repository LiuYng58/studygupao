package com.study.designpatterns.delegate.simple;

public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工A我擅长加密");
    }
}
