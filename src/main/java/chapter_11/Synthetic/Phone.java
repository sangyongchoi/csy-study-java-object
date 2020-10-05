package chapter_11.Synthetic;

import chapter_02.Money;
import chapter_10.Call;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    private RatePolicy ratePolicy;
    private List<Call> calls = new ArrayList<>();

    public Phone(RatePolicy ratePolicy) {
        this.ratePolicy = ratePolicy;
    }

    public List<Call> getCalls() {
        return calls;
    }

    public Money calculateFee(){
        return ratePolicy.calculateFee(this);
    }
}
