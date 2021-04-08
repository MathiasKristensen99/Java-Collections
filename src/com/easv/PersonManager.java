package com.easv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PersonManager {
    private static  PersonManager instance = null;
    private List<Person> personList = new LinkedList<>();
    //private List<Person> personList = new ArrayList<>();
    Person currentPerson;

    private PersonManager() {
    }

    public static PersonManager getInstance() {
        if (instance == null) {
            instance = new PersonManager();
        }
        return instance;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public Person getNextPerson() {
        //personList.remove(0);
        return personList.get(0);
    }

    Iterator<Person> personIterator = personList.iterator();


    public Person whoIsNext() {
        while (personIterator.hasNext()) {
            currentPerson = personIterator.next();
        }
        return currentPerson;
    }
}
