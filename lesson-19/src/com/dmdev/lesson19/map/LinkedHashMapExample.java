package com.dmdev.lesson19.map;

import com.dmdev.lesson19.person.Person;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Person Ivan = new Person(1, "Ivan", "Ivanov");
        Person Petr = new Person(29, "Petr", "Petrov");
        Person sveta = new Person(3, "sveta", "svetova");

        Map<Integer, Person> map = new LinkedHashMap<>();
        map.put(Ivan.getId(), Ivan);
        map.put(Petr.getId(), Petr);
        map.putIfAbsent(sveta.getId(), sveta);

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
