package com.dmdev.lesson19.person;

public class PersonExample {
    public static void main(String[] args) {
        Person Ivan = new Person(1, "Ivan", "Ivanov");
        Person Petr = new Person(1, "Ivan", "Ivanov");
//        Person Petr = new Person(2, "Petr", "Petrov");

        System.out.println(Ivan.hashCode());
        System.out.println(Petr.hashCode());
        System.out.println(Ivan.equals(Petr));
    }
    
}
