package com.varkovich.lesson_6.task_1;

import com.varkovich.lesson_6.task_1.entity.Student;
import com.varkovich.lesson_6.task_1.factory.StudentFactory;
import com.varkovich.lesson_6.task_1.user_action.UserAction;

import java.util.ArrayList;
import java.util.List;


/**
 * Создать класс для описания студента нашей группы.
 * Поля класса: имя, фамилия, номер паспорта, название группы (можно добавить свои поля по желанию - например, возраст).
 * Создать объекты этого класса для каждого из студента нашей группы.
 * Поместить все эти обеъекты в массив.
 * Пройти по массиву циклом for и вывести информацию на консоль.
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        StudentFactory studentFactory = new StudentFactory();
        List<Student> studentList = new ArrayList<>();
        UserAction userAction = new UserAction();

        studentList.add(studentFactory.createStudent("Dmitry", "Varkovich", "123-456"));
        studentList.add(studentFactory.createStudent("Pavel", "Ivanov", "565-234"));
        studentList.add(studentFactory.createStudent("Andrew", "Semenixin", "353-333"));
        studentList.add(studentFactory.createStudent("Sergey", "Odincov", "999-123"));

        userAction.executeInteraction(studentList);

    }
}
