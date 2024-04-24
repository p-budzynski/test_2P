package pl.kurs.task1.service;

import pl.kurs.task1.datatype.Person;

import java.io.*;

public class PersonService {

    public Person findPersonWithHighestIncome(Person[] persons) {
        Person personWithHigestIncome = null;
        double higestIncome = 0;

        for (Person person : persons) {
            if (person != null && person.getIncome() > higestIncome) {
                higestIncome = person.getIncome();
                personWithHigestIncome = person;
            }
        }
        return personWithHigestIncome;
    }

    public int countWomen(Person[] persons) {
        int womenCount = 0;

        for (Person person : persons) {
            if (person != null && !person.getGender()) {
                womenCount++;
            }
        }
        return womenCount;
    }

    public void savePersonsListToFile(Person[] persons, String fileName) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName);
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)) {

            outputStream.writeObject(persons);
            System.out.println("The list of persons has been saved to a file.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Person[] loadPersonsListFromFile(String fileName) {
        Person[] persons = null;
        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             ObjectInputStream inputStream = new ObjectInputStream(fileInputStream)) {
            persons = (Person[]) inputStream.readObject();
            System.out.println("The list of persons was loaded from a file.");
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return persons;
    }

    public void printPersonsList(Person[] persons) {
        System.out.println("Persons list:");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
