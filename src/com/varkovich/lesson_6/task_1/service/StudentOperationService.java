package com.varkovich.lesson_6.task_1.service;

import com.varkovich.lesson_6.task_1.entity.Student;

import java.util.List;

public class StudentOperationService {

    public void showStudents(List<Student> students) {
        if (students != null) {
            int i = 1;
            for (Student student : students) {
                System.out.printf("%s\n  name: %s\n  surname: %s\n  passport number: %s\n  group name: %s",
                        i, student.name, student.surname, student.passportNumber, student.groupName);
                i++;
                System.out.println("\n-------------------------------------------------------------");
            }

        } else {
            System.out.println("There is no student! Add student at the beginning");
        }
    }

}

