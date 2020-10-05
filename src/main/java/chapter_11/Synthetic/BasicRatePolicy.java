package chapter_11.Synthetic;

import chapter_02.Money;
import chapter_10.Call;

public abstract class BasicRatePolicy implements RatePolicy{

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
