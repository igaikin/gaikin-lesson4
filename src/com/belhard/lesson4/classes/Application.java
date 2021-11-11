package com.belhard.lesson4.classes;

import com.belhard.lesson4.classes.model.dao.StudentDao;
import com.belhard.lesson4.classes.model.dao.impl.StudentDaoJdbcImpl;
import com.belhard.lesson4.classes.model.entities.Student;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("List of students: ");
        StudentDao studentDao = new StudentDaoJdbcImpl();
        List<Student> students = studentDao.getAll();
        students.forEach(student ->
                System.out.println(student.getId() + ": " + student.getFirstName() + " " + student.getLastName()));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter ID of the student to see detail info: ");
        long id = scanner.nextLong();
        Student student = studentDao.getById(id);
        System.out.println(student.getFormattedOutput());
    }
}
