package com.study.designpatterns.proxy.dbroute;

import com.study.designpatterns.proxy.dbroute.proxy.OrderServiceStaticProxy;

import java.util.Date;

public class DbrouteProxyTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.setCreateTime(new Date().getTime());
        IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
        orderService.createOrder(order);
    }
}
