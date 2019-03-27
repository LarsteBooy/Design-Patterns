package com.larstebooy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;

public class App2 {
    private static final Comparator<String> lengthComparator = Comparator.comparingInt(String::length);
    private static final Comparator<String> alphabeticalComparator = Comparator.comparingInt(s -> s.charAt(0));
    private static final Comparator<String> containsEComparator = (s1, s2) -> {
        if (s1.contains("e") && !s2.contains("e")) {
            return -1;
        }
        if (!s2.contains("e") && s1.contains("e")) {
            return 1;
        } else {
            return 0;
        }
    };

    public static void main(String[] args) {

        comperators();
        streams();

    }

    private static void comperators() {
        String[] stringList = {"Echo", "Alpha", "Delta", "Beta", "Gamma", "Charlie", "Foxtrot", "Romeo", "Yankee", "Emancipatie"};

        //OPGAVE 1.1
        //shortest length to longest
        Arrays.sort(stringList, lengthComparator);
        System.out.println(Arrays.asList(stringList));

        //OPGAVE 1.2
        //longest length to shortest
        Arrays.sort(stringList, lengthComparator.reversed());
        System.out.println(Arrays.asList(stringList));

        //Opgave 1.3
        //alphabetical order
        Arrays.sort(stringList, alphabeticalComparator);
        System.out.println(Arrays.asList(stringList));

        //Opgave 1.4
        //contains e
        Arrays.sort(stringList, containsEComparator);
        System.out.println(Arrays.asList(stringList) + "\n");
    }

    private static void streams() {
        List<String> words = Arrays.asList("hi", "hello", "buenas dias", "goodbye", "hoi", "vaarwel", "tot ziens", "doei", "hoe", "mooi");

        //STRINGS
        //opgave 1
        //filter on E and length 4 characters of less
        words.stream()
                .map(String::toUpperCase)
                .filter(w -> w.length() <= 4)
                .filter(w -> w.contains("E"))
                .findFirst()
                .ifPresent(System.out::println);

        //opgave 2
        //concatenate all strings
        words.stream()
                .map(String::toUpperCase)
                .reduce((a, b) -> a + b)
                .ifPresent(System.out::println);

        //opgave 3
        //total sum of characters in the list
        words.stream()
                .map(String::length)
                .reduce((a, b) -> a + b)
                .ifPresent(System.out::println);

        //NUMBERS
        //opgave 1
        //stream met doublewaardes tussen 0 en 1
        double[] doubleStream = new Random().doubles(66).toArray();

        //opgave 2
        //sum of the square root of every number
        DoubleStream.of(doubleStream)
                .map(x -> x * x)
                .reduce((a, b) -> a + b)
                .ifPresent(System.out::println);

        //opgave 3
        //same as 2 but parallel
        DoubleStream.of(doubleStream)
                .parallel()
                .map(x -> x * x)
                .reduce((a, b) -> a + b)
                .ifPresent(System.out::println);

    }
}

