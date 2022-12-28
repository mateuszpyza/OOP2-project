package apps;

import models.Person;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski", 85, 184);
        Person person2 = new Person("Jan", "Kowalski", 85, 184);
        Person person3 = new Person("Krzysztof", "Anemia", 60, 190);
        System.out.println(person1.equals(person2));
        System.out.println(person2.equals(person1));
        System.out.println(person1.equals(person3));
        System.out.println('\n');
        System.out.println(person1);
        System.out.println(person2);

    }


}
