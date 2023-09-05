package BMI;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("write your weight: ");
        double weight = scanner.nextDouble();
        System.out.print("write your height: ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("your bmi is " + bmi);
    }
}
