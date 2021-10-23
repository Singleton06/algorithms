package com.github.singleton06.datatypes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lists {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("a b");
        Map<String, Person> person = str.stream().map(Person::parse)
                .collect(Collectors.toMap(p -> p.firstName, Function.identity()));
    }

    private static class Person {
        String firstName;
        String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public static Person parse(String person) {
            String[] s = person.split(" ");
            return new Person(s[0], s[1]);
        }
    }
}
