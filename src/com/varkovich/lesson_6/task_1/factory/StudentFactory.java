package com.varkovich.lesson_6.task_1.factory;

import com.varkovich.lesson_6.task_1.entity.Student;

public class StudentFactory {

    public Student createStudent(String name, String surname, String passportNumber) {
        return new Student(name, surname, passportNumber);
    }
}
