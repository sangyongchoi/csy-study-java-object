import chapter_02.AmountDiscountPolicy;
import chapter_02.Money;
import chapter_02.Movie;

import java.time.Duration;

public class ObjectApplication {
    public static void main(String[] args) {
        Movie starWars = new Movie("스타워즈",
                Duration.ofMinutes(210),
                Money.wons(10000),
                new AmountDiscountPolicy(Money.wons(1000)));
    }
}
