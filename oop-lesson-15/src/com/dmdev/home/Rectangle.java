package com.dmdev.home;

public class Rectangle {
    Point point1 = new Point(4, 7);
    Point point2 = new Point(10, 15);

    public void square(){
        int a = point1.getY() - point2.getY();
        int b = point1.getX() - point2.getX();
        int S = a * b;
        System.out.println("Площадь прямоугольника " + S);
    }
    public void diagonale(){
        int a = point1.getY() - point2.getY();
        int b = point1.getX() - point2.getX();
        int d = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Диагональ прямоугольника " + d);
    }
}
