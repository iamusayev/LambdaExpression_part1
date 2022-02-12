package LyamdaExpressionAndStreamApi.PartThreeTasks;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Given class Person with fields firstName, lastName, age
 * Display the full name of the oldest person whose name does not exceed 15 characters
 */

public class Task5 {
    public static void main(String[] args) {

        Stream<Person> personStream = Stream.of(
                new Person("John", "Wick", 23),
                new Person("Lucy", "Angeles", 55),
                new Person("Robert", "Junior", 50),
                new Person("Sam", "Nilson", 34),
                new Person("Al", "Pachino", 55),
                new Person("John", "Travolta", 60)
        );

        //1st way
        personStream.filter(person -> person.getFullName().length() < 15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);

        //2nd way
        personStream.reduce((person, person2) -> person.getAge() > person2.getAge() ? person : person2)
                .ifPresent(person -> System.out.println(person.getFullName()));


    }
}
