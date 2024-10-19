package com.varkovich.lesson_6.task_1.user_action;

import com.varkovich.lesson_6.task_1.entity.Student;
import com.varkovich.lesson_6.task_1.factory.StudentFactory;
import com.varkovich.lesson_6.task_1.service.StudentOperationService;

import java.util.List;
import java.util.Scanner;

public class UserAction {

    public void executeInteraction(List<Student> students) {
        Scanner console = new Scanner(System.in);
        StudentOperationService studentOperationService = new StudentOperationService();
        StudentFactory studentFactory = new StudentFactory();
        int chosenOperation = 0;
        boolean isCycleWorking = true;
        String name = "";
        String surname = "";
        String passportNumber = "";
        Student createdStudent;

        while (isCycleWorking) {
            System.out.println("1 - add student to the group");
            System.out.println("2 - show all students");
            System.out.println("3 - exit");
            System.out.print("Choose operation:");
            chosenOperation = console.nextInt();

            switch (chosenOperation) {
                case 1: {
                    System.out.print("Enter the name: ");
                    name = console.next();
                    System.out.print("Enter the surname: ");
                    surname = console.next();
                    System.out.print("Enter the passport number: ");
                    passportNumber = console.next();
                    createdStudent = studentFactory.createStudent(name, surname, passportNumber);
                    students.add(createdStudent);
                    System.out.println("Student has been added successfully");
                    break;
                }
                case 2: {
                    studentOperationService.showStudents(students);
                    break;
                }
                case 3: {
                    isCycleWorking = false;
                    break;
                }
            }
        }
    }
}
