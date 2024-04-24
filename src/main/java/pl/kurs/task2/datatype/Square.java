package pl.kurs.task2.datatype;

import java.util.Objects;

public class Square extends Figure{
    private final int side;

    public Square(int side) {
        super();
        if (side <= 0) {
            throw new IllegalArgumentException("The side length must be greater than zero.");
        }
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return side == square.side;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }

    @Override
    public String toString() {
        return super.toString() + "Square with side " + side + ".";
    }

}
