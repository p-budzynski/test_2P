package pl.kurs.task1.datatype;

public class Student extends Person {
    private String group;
    private double scholarship;

    public Student() {
    }

    public Student(String firstName, String lastName, String pesel, String city, String group, double scholarship) {
        super(firstName, lastName, pesel, city);
        this.group = group;
        if (scholarship < 0) {
            throw new IllegalArgumentException("The scholarship cannot be less than zero.");
        }
        this.scholarship = scholarship;
    }

    @Override
    public double getIncome() {
        return scholarship;
    }

    @Override
    public String toString() {
        return super.toString() + ", Student, Group: " + group + ", Scholarship: " + scholarship + " PLN";
    }

}
