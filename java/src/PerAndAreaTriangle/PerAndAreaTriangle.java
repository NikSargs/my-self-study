package PerAndAreaTriangle;

import java.util.Scanner;

public class PerAndAreaTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("write a: ");
        double a = scanner.nextDouble();

        System.out.print("write b: ");
        double b = scanner.nextDouble();

        System.out.print("write c: ");
        double c = scanner.nextDouble();

        System.out.print("write h: ");
        double h = scanner.nextDouble();

        double P = a + b + c;
        double A = (b * h) / 2;
        System.out.println("Perimeter if triangle is " + P);
        System.out.println("Area of triangle is " + A);
    }
}
