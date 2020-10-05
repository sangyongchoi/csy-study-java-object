package chapter_11;

import chapter_02.Money;

import java.time.Duration;

public class RateDiscountableAndTaxbleNightlyDiscountPhone extends RateDiscountableNightlyDiscountPhone{
    private double taxRate;

    public RateDiscountableAndTaxbleNightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration seconds
            , Money discountAmount, double taxRate) {
        super(nightlyAmount, regularAmount, seconds, discountAmount);
        this.taxRate = taxRate;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return super.afterCalculated(fee).plus(fee.times(taxRate));
    }
}
