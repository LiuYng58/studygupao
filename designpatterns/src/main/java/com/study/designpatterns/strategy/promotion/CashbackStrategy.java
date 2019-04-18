package com.study.designpatterns.strategy.promotion;

/**
 * 返现
 */
public class CashbackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("支付宝返现");
    }
}
