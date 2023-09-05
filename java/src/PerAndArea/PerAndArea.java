package PerAndArea;

import java.util.Scanner;

public class PerAndArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("write a width: ");
        double width = scanner.nextDouble();

        System.out.print("write a length: ");
        double length = scanner.nextDouble();

        double perimeter = 2 * (width + length);
        double area = width * length;
        System.out.println("Perimeter of is " + perimeter + " and area is " + area);
    }
}
