package chapter_14.abstract_painting;

import chapter_14.Call;
import chapter_14.DateTimeInterval;

import java.util.List;

public interface FeeCondition {
    List<DateTimeInterval> findTimeIntervals(Call call);
}
