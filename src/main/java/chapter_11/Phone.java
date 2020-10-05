package chapter_11;

import chapter_02.Money;
import chapter_10.Call;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
    private List<Call> calls = new ArrayList<>();

    public List<Call> getCalls() {
        return calls;
    }

    public Money calculaateFee(){
        Money result = Money.ZERO;

        for (Call call : calls) {
            result = result.plus(calculateFee(call));
        }

        return result;
    }

    abstract protected Money calculateFee(Call call);

    abstract protected Money afterCalculated(Money fee);
}
