package circlePer;

import java.util.Scanner;

public class CirclePer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("write radius of circle: ");
        double radius = scanner.nextDouble();
        double pi = 3.14;
        double perimeter = 2 * pi * radius;
        System.out.println("Perimeter of circle is " + perimeter);
    }
}
