package com.study.designpatterns.strategy.promotion;

public class PromotionActivityTest {
   /* public static void main(String[] args) {
        PromotionActivity promotionActivity = new PromotionActivity(new CashbackStrategy());
        promotionActivity.execute();
    }*/
   public static void main(String[] args) {
       String promotionKsy = "COUPON";
       PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKsy));
       promotionActivity.execute();
   }
}
