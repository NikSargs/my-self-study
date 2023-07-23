package com.dmdev.lesson1;

public class home1 {
    public static void main(String[] args) {
        String value = "а роза упала на лапу Азора";
        System.out.println(palindrom(value));
    }
    public static boolean palindrom(String value){
        String value_from_end = new StringBuilder(value).reverse().toString();

        return value_from_end.equals(value);
    }
}
