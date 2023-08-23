package com.dmdev.lesson19.map;

import com.dmdev.lesson19.person.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Person Ivan = new Person(1, "Ivan", "Ivanov");
        Person Petr = new Person(2, "Petr", "Petrov");

        Map<Integer, Person> map = new HashMap<>();
        map.put(Ivan.getId(), Ivan);
        map.put(Petr.getId(), Petr);

        System.out.println(map.get(2));
    }
}
