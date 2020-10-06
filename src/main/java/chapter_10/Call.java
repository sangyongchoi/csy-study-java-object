package chapter_10;

import chapter_14.DateTimeInterval;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class Call {
    private LocalDateTime from;
    private LocalDateTime to;

    public Call(LocalDateTime from, LocalDateTime to) {
        this.from = from;
        this.to = to;
    }

    public Duration getDuration(){
        return Duration.between(from, to);
    }

    public LocalDateTime getFrom(){
        return from;
    }
}
