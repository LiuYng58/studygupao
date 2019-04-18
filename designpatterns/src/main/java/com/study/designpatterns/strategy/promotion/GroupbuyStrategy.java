package com.study.designpatterns.strategy.promotion;

/**
 * 团购
 */
public class GroupbuyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("团购有优惠");
    }
}
