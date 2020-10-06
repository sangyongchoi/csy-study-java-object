package chapter_14.abstract_painting;

import chapter_02.Money;
import chapter_14.Phone;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}