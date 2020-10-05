package chapter_11.Synthetic;

import chapter_02.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
