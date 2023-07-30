package com.dmdev.lesson11;

public class OopLessonRunner3 {
    public static void main(String[] args) {
        Printable laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Printable mobile = new Mobile(new Ssd(350), new Ram(1034));

        printWithRandom(laptop, mobile);
    }
    public static void print(Printable... objects){
        for (Printable object : objects){
            object.print();
            System.out.println();
        }
    }
    public static void printWithRandom(Printable... objects){
        for (Printable object : objects){
            object.printWithRandom();
            System.out.println();
        }
    }
}
