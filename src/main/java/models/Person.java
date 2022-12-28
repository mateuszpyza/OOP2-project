package models;

import java.util.Objects;

public class Person {
    private final String firstName;
    private final String surname;
    private double weight;
    private double height;

    public Person(String firstName, String surname, double weight, double height) {
        this.firstName = firstName;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(person.weight, weight) == 0 && Double.compare(person.height, height) == 0 && firstName.equals(person.firstName) && surname.equals(person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surname, weight, height);
    }
}
