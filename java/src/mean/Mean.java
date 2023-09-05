package mean;

import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("write first number: ");
        double first = scanner.nextDouble();
        System.out.print("write second number: ");
        double second = scanner.nextDouble();
        double mean = (first + second) / 2;
        System.out.println("arithmetic mean is " + mean);
    }
}
