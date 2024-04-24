package pl.kurs.task1.app;

import pl.kurs.task1.datatype.Employee;
import pl.kurs.task1.datatype.Person;
import pl.kurs.task1.datatype.Student;
import pl.kurs.task1.service.PersonService;

public class Main {
    public static void main(String[] args) {
        String fileName = "personsList.obj";

        Person[] persons = {
                new Employee("Anna","Nowak","82041209544","Warsaw","Lawyer",12575.54),
                new Employee("Ewa","Kowalik","75092295848","Cracow","Teacher",4293.77),
                new Employee("Kamil","Wójcik","95123175841","Wroclaw","Programmer",8431.82),
                new Employee("Ryszard","Stachowski","99031485473","Poznań","Uber driver",7049.71),
                new Employee("Jolanta","Mała","64081902852","Łódź","Accountant",7257.42),

                new Student("Piotr", "Piotrowski", "02251139685", "Warsaw", "14-G", 1243.21),
                new Student("Ignacy", "Igła", "04300656987", "Teresin", "22-A", 842.76),
                new Student("Aldona", "Białka", "99012502874", "Białystok", "11-C", 1195.35),
                new Student("Ilona", "Lizak", "02272546966", "Szczecin", "25-B", 2210.62),
                new Student("Kamila", "Kamińska", "97090495102", "Warsaw", "12-C", 958.18)
        };

        PersonService personService = new PersonService();

        System.out.println("Person with the highest income: " + personService.findPersonWithHighestIncome(persons));
        System.out.println("Number of women in array: " + personService.countWomen(persons));

        personService.savePersonsListToFile(persons, fileName);

        Person[] loadedList = personService.loadPersonsListFromFile(fileName);

        personService.printPersonsList(loadedList);

    }
}
