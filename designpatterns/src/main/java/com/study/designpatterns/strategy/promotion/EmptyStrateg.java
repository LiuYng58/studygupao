package com.study.designpatterns.strategy.promotion;

/**
 * 原价，无优惠
 */
public class EmptyStrateg implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("原价，无优惠");
    }
}
