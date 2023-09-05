package NumberIsBigger;

import java.util.Scanner;

public class NumberIsBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write first number: ");
        int first = scanner.nextInt();

        System.out.print("Write second number: ");
        int second = scanner.nextInt();

        if (first > second) {
            System.out.println(first + " is bigger than " + second);
        } else if(first < second) {
            System.out.println(second + " is bigger than " + first);
        } else {
            System.out.println(first + " is equals " + second);
        }
    }
}
