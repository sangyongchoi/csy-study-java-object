import chapter_02.Money;
import chapter_02.Movie;
import chapter_02.NoneDiscountPolicy;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class ObjectApplication {
    public static void main(String[] args) {
        Movie starWars = new Movie("스타워즈",
                Duration.ofMinutes(210),
                Money.wons(10000),
                new NoneDiscountPolicy());
    }
}
