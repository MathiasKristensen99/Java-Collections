package com.easv;

import java.time.LocalDate;

public class Person {
    private int personID;
    private String name;
    private LocalDate birthDate;



    public Person(int personID, String name, LocalDate birthDate) {
        this.personID = personID;
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personID=" + personID +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
