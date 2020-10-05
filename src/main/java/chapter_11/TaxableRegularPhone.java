package chapter_11;

import chapter_02.Money;
import chapter_10.Call;

import java.time.Duration;

public class TaxableRegularPhone extends RegularPhone{
    private double taxRate;

    public TaxableRegularPhone(Money amount, Duration seconds, double taxRate) {
        super(amount, seconds);
        this.taxRate = taxRate;
    }

    @Override
    public Money calculateFee(Call call){
        Money fee = super.calculateFee(call);
        return fee.plus(fee.times(taxRate));
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.plus(fee.times(taxRate));
    }
}
