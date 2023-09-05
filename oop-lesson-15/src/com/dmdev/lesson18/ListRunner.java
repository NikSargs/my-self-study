package com.dmdev.lesson18;

public class ListRunner {
    public static void main(String[] args) {
        List<String> list = new List<>(10);
        list.add("string1");
        list.add("string2");
        list.add("string3");

        Object element = list.get(1);
    }
}
