package pl.kurs.task1.datatype;

public class Employee extends Person {
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String pesel, String city, String position, double salary) {
        super(firstName, lastName, pesel, city);
        this.position = position;
        if (salary < 0) {
            throw new IllegalArgumentException("The salary cannot be less than zero.");
        }
        this.salary = salary;
    }

    @Override
    public double getIncome() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Employee, Position: " + position + ", Salary: " + salary + " PLN";
    }
}
