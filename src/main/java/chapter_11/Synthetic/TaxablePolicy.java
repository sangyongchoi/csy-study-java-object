package chapter_11.Synthetic;

import chapter_02.Money;

public class TaxablePolicy extends AdditionalRatePolicy{
    private double taxRatio;

    public TaxablePolicy(RatePolicy next, double taxRatio) {
        super(next);
        this.taxRatio = taxRatio;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.plus(fee.times(taxRatio));
    }
}
