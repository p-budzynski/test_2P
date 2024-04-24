package pl.kurs.task1.datatype;

import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private String pesel;
    private String city;

    public Person() {
    }

    public Person(String firstName, String lastName, String pesel, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.city = city;
    }

    public boolean getGender() {
        if (!isCorrectPesel(pesel)) {
            throw new IllegalArgumentException(firstName + " " + lastName + " has the wrong PESEL number.");
        }
        return Integer.parseInt(String.valueOf(pesel.charAt(10))) % 2 != 0;
    }

    public double getIncome() {
        return 0;
    }

    private boolean isCorrectPesel(String pesel) {
        if (!pesel.matches("[0-9]+")) {
            return false;
        }
        return pesel.length() == 11;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", PESEL: " + pesel + ", City: " + city;
    }
}
