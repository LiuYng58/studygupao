package com.study.designpatterns.proxy.dbroute;

public class OrderService implements IOrderService{
    private OrderDao orderDao;
    public OrderService(){
        orderDao = new OrderDao();
    }
    @Override
    public int createOrder(Order order) {
        orderDao.insert(order);

        return 0;
    }
}
