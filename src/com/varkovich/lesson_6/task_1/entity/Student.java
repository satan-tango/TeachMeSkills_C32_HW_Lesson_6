package com.varkovich.lesson_6.task_1.entity;

public class Student {

    public String name;
    public String surname;
    public String passportNumber;
    public final String groupName = "C32";

    public Student(String name, String surname, String passportNumber) {
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
    }
}
