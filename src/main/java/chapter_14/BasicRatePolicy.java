package chapter_14;

import chapter_02.Money;
public abstract class BasicRatePolicy implements RatePolicy {

    @Override
    public Money calculateFee(Phone phone) {
        Money result = Money.ZERO;

        for (Call call : phone.getCalls()) {
            result.plus(calculateFee(call));
        }

        return result;
    }

    protected abstract Money calculateFee(Call call);
}