package chapter_12;

import java.util.Arrays;

public class LectureMain {
    public static void main(String[] args) {
        Lecture lecture = new GradeLecture(70, "객체지향 프로그래밍",
                Arrays.asList(81, 95, 75, 50, 45),
                Arrays.asList(new Grade("A", 100, 95)
                        , new Grade("B", 94, 80)
                        , new Grade("C", 79, 70)
                        , new Grade("D",69,50)
                        , new Grade("F",49,0)));

    }
}
