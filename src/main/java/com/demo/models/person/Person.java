package com.demo.models.person;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = -8949497101147546840L;

    private String firstName;

    private String cityName;

    private int age;


    public Person (String firstName, String cityName, int age) {

        this.firstName = firstName;
        this.cityName = cityName;
        this.age = age;

    }

    public Person() {
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "{" +
            " firstName='" + getFirstName() + "'" +
            ", cityName='" + getCityName() + "'" +
            ", age='" + getAge() + "'" +
            "}";
    }

}
