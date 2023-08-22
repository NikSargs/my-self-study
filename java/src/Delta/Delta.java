package Delta;

import java.util.Scanner;

public class Delta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("write first number: ");
        double a = scanner.nextDouble();

        System.out.print("write second number: ");
        double b = scanner.nextDouble();

        System.out.print("write third number: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("delta is " + delta);

    }
}
