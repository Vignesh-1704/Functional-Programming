package org.example.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.example.imperative.Person.Gender.FEMALE;
import static org.example.imperative.Person.Gender.MALE;

public class Imperative {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Anandhu Vijay", MALE),
                new Person("Mohana Mary",FEMALE),
                new Person("Naimisha",FEMALE),
                new Person("Siddharth",MALE),
                new Person("Mohan",MALE)
        );

        // Imperative Approach
        System.out.println("Imperative Approach");
        List<Person> females = new ArrayList<>();

        for(Person person : people) {
            if(FEMALE.equals(person.gender))
                females.add(person);
        }

        for(Person female: females){
            System.out.println(female);
        }


        // Declarative Approach
        System.out.println("Declarative Approach");
        people.stream().filter(person -> FEMALE.equals(person.gender)).
                collect(Collectors.toList()).
                forEach(System.out::println);
    }
}

