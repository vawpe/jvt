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

        Point p1 = new Point(3,5);
        Point p2 = new Point(2,4);

        /** Ниже вычисляем расстояние от точки, которая вызывает метод до другой точки, которая задана в параметре метода */
        System.out.println("Расстояние между точкой p1(" + p1.x + "," + p1.y + ") " +
                "и точкой p2(" + p2.x + "," + p2.y + ") равно " + p1.distance(p2));
    }

    public static void hello (String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }
}
