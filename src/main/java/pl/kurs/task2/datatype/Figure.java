package pl.kurs.task2.datatype;

import java.io.Serializable;

public abstract class Figure implements Serializable {
    private static int count = 0;
    protected int number;

    public Figure() {
        this.number = 0;
    }

    public static Figure createSquare(int side) {
        Square square = new Square(side);
        square.number = ++count;
        return square;
    }

    public static Figure createCircle(int radius) {
        Circle circle = new Circle(radius);
        circle.number = ++count;
        return circle;
    }

    public static Figure createRectangle(int sideA, int sideB) {
        Rectangle rectangle = new Rectangle(sideA, sideB);
        rectangle.number = ++count;
        return rectangle;
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    @Override
    public String toString() {
        return "Figure nr " + number + ": ";
    }
}
