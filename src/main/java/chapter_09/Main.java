package chapter_09;

import chapter_10.InstrumentedHashSet;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        InstrumentedHashSet<String> languages = new InstrumentedHashSet<>();
        languages.addAll(Arrays.asList("Java", "Ruby", "Scala"));

        languages.printSize();
    }
}
