package pl.kurs.task2.datatype;

import java.util.Objects;

public class Circle extends Figure {
    private static final double NUMBER_PI = Math.PI;
    private final int radius;

    public Circle(int radius) {
        super();
        if (radius <= 0) {
            throw new IllegalArgumentException("The radius length must be greater than zero.");
        }
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * NUMBER_PI * radius;
    }

    @Override
    public double calculateArea() {
        return NUMBER_PI * Math.pow(radius, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return super.toString() + "Circle with radius " + radius + ".";
    }

}
