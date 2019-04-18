package com.study.designpatterns.strategy.promotion;

public class CouponStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("原价减掉优惠券价格");
    }
}
