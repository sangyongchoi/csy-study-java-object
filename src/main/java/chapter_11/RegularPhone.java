package chapter_11;

import chapter_02.Money;
import chapter_10.Call;

import java.time.Duration;

public class RegularPhone extends Phone{
    private Money amount;
    private Duration seconds;

    public RegularPhone(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateFee(Call call) {
        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee;
    }
}
