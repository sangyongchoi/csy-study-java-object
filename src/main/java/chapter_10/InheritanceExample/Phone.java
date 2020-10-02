package chapter_10.InheritanceExample;

import chapter_02.Money;
import chapter_10.Call;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
    private List<Call> calls = new ArrayList<>();

    public Money calculateFee(){
        Money result = Money.ZERO;

        for (Call call : calls) {
            result.plus(calculateCallFee(call));
        }

        return result;
    }

    abstract protected Money calculateCallFee(Call call);
}
