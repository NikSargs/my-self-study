package com.dmdev.lesson10;

public class Task1 {

    public static void main(String[] args) {
        String value = "asdasd :( asdasdasd :( asdasd :( asdasd :) eqwe :) asdasd :) dasd";
        String result = replace(value);
        System.out.println(result);
    }

    public static String replace(String value) {
        return value.replace(":(", ":)");
    }
}
