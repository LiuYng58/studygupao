package com.study.designpatterns.proxy.dbroute;

import com.study.designpatterns.proxy.dbroute.proxy.OrderServiceDynamicProxy;

import java.util.Date;

public class DbrouteProxyTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.setCreateTime(new Date().getTime());
//        IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
        IOrderService orderService = (IOrderService)new OrderServiceDynamicProxy().getInstance(new OrderService());
        orderService.createOrder(order);
    }
}
