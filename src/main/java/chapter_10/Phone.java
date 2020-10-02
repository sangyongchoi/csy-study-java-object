package chapter_10;

import chapter_02.Money;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Phone {
    private Money amount;
    private Duration seconds;
    private double taxRate;
    private List<Call> calls = new ArrayList<>();

    public Phone(Money amount, Duration seconds, double taxRate) {
        this.amount = amount;
        this.seconds = seconds;
        this.taxRate = taxRate;
    }

    public void call(Call call) {
        calls.add(call);
    }

    public List<Call> getCalls() {
        return calls;
    }

    public Money getAmount(){
        return amount;
    }

    public Duration getSeconds() {
        return seconds;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public Money calculateFee(){
        Money result = Money.ZERO;

        for (Call call : calls) {
            result = result.plus(amount.times(call.getDuration().getSeconds() / seconds.getSeconds()));
        }

        return result.plus(result.times(taxRate));
    }
}
