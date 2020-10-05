package chapter_09;

public class DiscountPolicyFactory {
    public static DiscountPolicy createDiscountPolicy(){
        return new AmountDiscountPolicy();
    }
}
