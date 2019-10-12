package ru.stqa.jft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("World");
        hello("Ed");
        hello("Sasha");

        double l = 6;
        double a = 5;
        double b = 10;

        System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));
    }

    public static void hello (String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(double l) {
        return l * l;
    }

    public static double area(double a, double b) {
        return a * b;
    }
}
