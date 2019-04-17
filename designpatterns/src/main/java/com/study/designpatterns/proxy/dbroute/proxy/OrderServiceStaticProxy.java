package com.study.designpatterns.proxy.dbroute.proxy;

import com.study.designpatterns.proxy.dbroute.IOrderService;
import com.study.designpatterns.proxy.dbroute.Order;
import com.study.designpatterns.proxy.dbroute.db.DynamicDataSourceEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceStaticProxy implements IOrderService {
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    private IOrderService orderService;
    public OrderServiceStaticProxy(IOrderService orderService){
        this.orderService = orderService;
    }
    @Override
    public int createOrder(Order order) {
        Long time = order.getCreateTime();
        Integer dbRoute = Integer.valueOf(yearFormat.format(new Date()));
        System.out.println("静态代理类自动分配到【DB_" + dbRoute + "】数据源处理数据");
        DynamicDataSourceEntity.set(dbRoute);
        orderService.createOrder(order);
        return 0;
    }
}
