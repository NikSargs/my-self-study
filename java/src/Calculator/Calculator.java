package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("write first number");
        int first = in.nextInt();
        System.out.println("write second number");
        int second = in.nextInt();
        int sum = first + second;
        System.out.println("addition is " + sum);
        int substr = second - first;
        System.out.println("subtraction is " + substr);
        int mult = first * second;
        System.out.println("multiplication is " + mult);
        int div = second / first;
        System.out.println("division is " + div);

    }
}
