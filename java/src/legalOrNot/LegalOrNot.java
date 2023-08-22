package legalOrNot;

import java.util.Scanner;

public class LegalOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("write your age: ");
        double age = scanner.nextInt();
        if (age < 18) {
            System.out.println("you are not legal");
        }else {
            System.out.println("you are legal");
        }
    }
}
