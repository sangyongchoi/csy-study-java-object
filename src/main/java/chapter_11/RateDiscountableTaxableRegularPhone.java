package chapter_11;

import chapter_02.Money;

import java.time.Duration;

public class RateDiscountableTaxableRegularPhone extends RateDiscountableRegularPhone{
    private double taxRate;

    public RateDiscountableTaxableRegularPhone(Money amount, Duration seconds, Money discountAmount, double taxRate) {
        super(amount, seconds, discountAmount);
        this.taxRate = taxRate;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return super.afterCalculated(fee).plus(fee.times(taxRate));
    }
}
