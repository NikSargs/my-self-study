package com.dmdev.lesson19.map;

import com.dmdev.lesson19.person.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("123", "456", "789", "14");

//        Collections.sort(strings);
        System.out.println(strings);

        List<Person> personlist = Arrays.asList(
                new Person(1, "Ivan", "Ivanov"),
                new Person(29, "Petr", "Petrov"),
                new Person(3, "Sveta", "Svetova")
        );
        Collections.sort(personlist);
        System.out.println(personlist);

        personlist.sort(new FirstNameCorporator());
        System.out.println(personlist);
    }
    public static class FirstNameCorporator implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }
}
