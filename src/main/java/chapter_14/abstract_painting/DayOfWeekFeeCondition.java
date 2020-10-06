package chapter_14.abstract_painting;

import chapter_14.Call;
import chapter_14.DateTimeInterval;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DayOfWeekFeeCondition implements FeeCondition{
    private List<DayOfWeek> dayOfWeeks = new ArrayList<>();

    public DayOfWeekFeeCondition(List<DayOfWeek> dayOfWeeks) {
        this.dayOfWeeks = dayOfWeeks;
    }

    @Override
    public List<DateTimeInterval> findTimeIntervals(Call call) {
        return call.getInterval().splitByDay()
                .stream()
                .filter(each -> dayOfWeeks.contains(each.getFrom().getDayOfWeek()))
                .collect(Collectors.toList());
    }

}
