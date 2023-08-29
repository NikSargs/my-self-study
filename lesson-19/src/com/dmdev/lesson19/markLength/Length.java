package com.dmdev.lesson19.markLength;

import java.util.ArrayList;
import java.util.List;

public class Length {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("this");
        list.add("is");
        list.add("lots");
        list.add("of");
        list.add("fun");
        list.add("for");
        list.add("every");
        list.add("Java");
        list.add("programmer");
//        System.out.println(list);
        markLength4(list);

    }
    public static void markLength4(List<String> list){
        ArrayList<String> newList = new ArrayList<>();
        for (String element : list) {
            if(element.length() == 4) {
                newList.add( "****");

            }
            newList.add(element);
        }
        System.out.println(newList);
    }

}
