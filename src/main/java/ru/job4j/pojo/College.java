package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Bohdan Shevyrov");
        student.setGroup("A-01");
        student.setIncome(new Date());

        System.out.println(student.getFullName() + " studying in a group : " + student.getGroup()
                + " from " + student.getIncome());
    }
}
