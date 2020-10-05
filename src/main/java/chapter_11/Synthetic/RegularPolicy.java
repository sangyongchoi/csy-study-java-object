package chapter_11.Synthetic;

import chapter_02.Money;
import chapter_10.Call;

import java.time.Duration;

public class RegularPolicy extends BasicRatePolicy{
    private Money amount;
    private Duration seconds;

    public RegularPolicy(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateFee(Call call) {
        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
