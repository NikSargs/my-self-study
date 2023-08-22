package circleArea;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("write a radius: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the circle is " + area);
    }
}
