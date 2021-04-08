package com.easv;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        PersonManager personManager = PersonManager.getInstance();

	    Person person1 = new Person(1, "Brian", LocalDate.of(1999, 2, 1));
        Person person2 = new Person(2, "Brian", LocalDate.now());
        Person person3 = new Person(3, "Brian", LocalDate.now());
        Person person4 = new Person(4, "Brian", LocalDate.now());
        Person person5 = new Person(5, "Brian", LocalDate.now());

        personManager.addPerson(person1);
        personManager.addPerson(person2);
        personManager.addPerson(person3);
        personManager.addPerson(person4);
        personManager.addPerson(person5);

        System.out.println("Exercise 1-2");
        for (Person p: personManager.getPersonList()) {
            System.out.println(p);
        }

        System.out.println(" ");
        System.out.println("First of the brians - Exercise 3");
        for (int i = 0; i < 1; i++) {
            System.out.println(personManager.getNextPerson());
        }

        System.out.println(" ");
        System.out.println("Exercise 4");
        for (int i = 0; i < 1; i++) {
            System.out.println(personManager.getNextPerson());
        }
    }
}
