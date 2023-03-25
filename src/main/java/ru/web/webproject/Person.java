package ru.web.webproject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private static int counter;
    private String firstName;
    private String lastName;
    private int age;
    private String mail;
    private String address;
    public Person(String firstName, String lastName, int age, String mail, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.mail = mail;
        this.address = address;
    }
}
