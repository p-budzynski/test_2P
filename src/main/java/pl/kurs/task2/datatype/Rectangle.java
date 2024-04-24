package pl.kurs.task2.datatype;

import java.util.Objects;

public class Rectangle extends Figure {
    private final int sideA;
    private final int sideB;

    public Rectangle(int sideALength, int sideBLength) {
        super();
        if (sideALength <= 0 || sideBLength <= 0) {
            throw new IllegalArgumentException("The length of both sides must be greater than zero.");
        }
        this.sideA = sideALength;
        this.sideB = sideBLength;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (sideA + sideA);
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return sideA == rectangle.sideA && sideB == rectangle.sideB;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB);
    }

    @Override
    public String toString() {
        return super.toString() + "Rectangle with sides " + sideA + "x" + sideB + ".";
    }

}
