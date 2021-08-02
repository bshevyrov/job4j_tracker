package ru.job4j.inheritance;

public class Patient {
    private  String name;
    private int age;
    private String[] symptoms;

    public Patient() {
    }

    public Patient(String name, int age, String[] symptoms) {
        this.name = name;
        this.age = age;
        this.symptoms = symptoms;
    }
}
