package com.study.designpatterns.delegate.simple;

import java.util.HashMap;
import java.util.Map;

public class Leader {
    private  Map<String,IEmployee> register = new HashMap<>();
    public Leader() {
        register.put("加密",new EmployeeA());
        register.put("架构",new EmployeeB());
    }
    public void doing(String command){
        register.get(command).doing(command);
    }
}
