package com.techreturners.exercise002;

public class Person {
    private String firstname;
    private String secondname;
    private String city;
    private int age;

    public Person(String firstname, String secondname, String city, int age) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.city = city;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public String getCity() {
        return city;
    } 
    public int getAge() {
        return age;
    } 
}
