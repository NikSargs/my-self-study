package com.dmdev.lesson1;

import java.util.Arrays;

public class home4 {
    public static int[] numbers(String str){
        int[] numbers;
        StringBuilder numbers_string = new StringBuilder();
        int ind = 0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i))){
                numbers_string.append(str.charAt(i));
                ind++;
            }

        }
         numbers = new int[ind];
        for (int i = 0; i < numbers.length; i++){
            int number = Character.getNumericValue(numbers_string.charAt(i));
            numbers[i] = number;
        }
        return numbers;
    }
    public static int sum_of_numbers(int[] numbers){
        int sum = 0;
        for(int value : numbers) {
            sum += value;
        }
        return sum;
    }
    public static void main(String[] args) {
        String str = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        int sum = sum_of_numbers(numbers(str));
        System.out.println(Arrays.toString(numbers(str)));
        System.out.println(sum);
    }
}
