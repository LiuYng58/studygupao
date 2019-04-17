package com.study.designpatterns.proxy.dbroute;

public class OrderDao {
    public int insert(Order order){
        System.out.println("创建订单");
        return 1;
    }
}
