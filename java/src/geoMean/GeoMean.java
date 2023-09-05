package geoMean;

import java.util.Scanner;

public class GeoMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("write first number: ");
        double first = scanner.nextDouble();
        System.out.print("write second number: ");
        double second = scanner.nextDouble();
        System.out.print("write third number: ");
        double third = scanner.nextDouble();
        double mult = first * second * third;
        double geo_mean = Math.pow(mult, (double) 1/3);


        geo_mean = geo_mean * 100;
        geo_mean = (int) geo_mean;
        geo_mean = geo_mean/100;
        System.out.println("geomethric mean is " + geo_mean);

    }
}
