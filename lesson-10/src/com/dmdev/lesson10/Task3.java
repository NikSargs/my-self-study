package com.dmdev.lesson10;

public class Task3 {
    public static void main(String[] args) {
        String result = format("Ivan", "Petrov", "Sidorovich");
        System.out.println(result);
    }
    public static String format(String firstName, String lastname, String secondName){
//        char firstNameChar = firstName.toUpperCase().charAt(0);
//        char lastNameChar = lastname.toUpperCase().charAt(0);
//        char secondNameChar = secondName.toUpperCase().charAt(0);
        char firstNameChar = Character.toUpperCase(firstName.charAt(0));
        char lastNameChar = Character.toUpperCase(lastname.charAt(0));
        char secondNameChar = Character.toUpperCase(secondName.charAt(0));

//        return firstNameChar + " . " + lastNameChar + " . " + secondNameChar;
        return String.format("%s.%s.%s",firstNameChar, lastNameChar, secondNameChar);
    }
}
