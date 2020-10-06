package chapter_14;

import chapter_02.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}