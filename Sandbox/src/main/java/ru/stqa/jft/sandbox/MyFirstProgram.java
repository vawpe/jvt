package ru.stqa.jft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("World");
        hello("Ed");
        hello("Sasha");

        Square s = new Square(6);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(5, 10);
        System.out.println("Площадь прямоугольника со сторонами " +
                r.a + " и " + r.b + " = " + r.area());
    }

    public static void hello (String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }
}
