package ru.stqa.jft.sandbox;

public class Point {

    double x;       /** горизонтальная координата */
    double y;       /** вертикальная координата */

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p2) {

        Point p1 = new Point(x,y);

        /** Формула расчета расстояния между точками */
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    }
}
