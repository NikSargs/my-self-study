package com.dmdev.lesson19.map;

import com.dmdev.lesson19.person.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Person Ivan = new Person(1, "Ivan", "Ivanov");
        Person Petr = new Person(2, "Petr", "Petrov");
        Person sveta = new Person(1, "sveta", "svetova");

        Map<Integer, Person> map = new HashMap<>();
        map.put(Ivan.getId(), Ivan);
        map.put(Petr.getId(), Petr);
        map.putIfAbsent(sveta.getId(), sveta);

//        System.out.println(map.get(2));
//
//
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.entrySet());
//
//        for (Person person : map.values()) {
//            System.out.println(person.getFirstName());
//        }
        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }
        System.out.println(map.containsKey(2));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.getOrDefault(2, sveta));
    }
}
