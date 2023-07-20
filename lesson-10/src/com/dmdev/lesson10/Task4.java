package com.dmdev.lesson10;

public class Task4 {
    public static void main(String[] args) {
        String value = "asdasd.,!asdasdqwe.....,?afd!asd";
        System.out.println(count(value));
    }
    public static int count(String value){
        String result = value.replace(".", "")
                .replace(",", "")
                .replace("!", "");
        return value.length() - result.length();
    }
}
