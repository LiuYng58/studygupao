package com.study.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {
    public static void main(String[] args) {
        PrototypeA prototypeA = new PrototypeA();
        List<String> hobbies = new ArrayList<>();
        prototypeA.setHobbies(hobbies);
        prototypeA.setName("原型");
        prototypeA.setAge(12);
        Client client = new Client();
        PrototypeA prototype = (PrototypeA)client.startClone(prototypeA);
        prototype.getHobbies().add("游戏");
        System.out.println(prototype.getHobbies() + "....." + prototypeA.getHobbies());
        System.out.println(prototype.getHobbies() == prototypeA.getHobbies());
    }
}
