package com.dmdev.lesson1;

import java.util.Arrays;

public class home3 {
    public static void main(String[] args) {
        String str = "aaab aaaac aaar";
        newString(str);
    }

    public static void newString(String str){
        char[] array = new char[str.length()];

        for (int i = 0; i < str.length(); i++){
            array[i] = str.charAt(i);
        }
        int index = 0;
        for (int i = 0; i < array.length; i++){
            int j;
            for (j = 0; j < i; j++){
                if (array[i] == array[j]){
                    break;
                }
            }
            if (j == i) {
                array[index++] = array[i];
            }
        }
        String new_string = String.valueOf(Arrays.copyOf(array, index));
        new_string =  new_string.replace(" ", "");

        System.out.println(new_string);
    }
}
