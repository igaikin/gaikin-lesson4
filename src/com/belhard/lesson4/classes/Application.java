package com.belhard.lesson4.classes;

import com.belhard.lesson4.classes.model.beans.entities.Student;
import com.belhard.lesson4.classes.model.dao.connection.ConnectionManager;
import com.belhard.lesson4.classes.model.service.StudentService;
import com.belhard.lesson4.classes.model.service.StudentServiceImpl;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.print("Please, enter ID of the student to see detail info: ");
                long id = scanner.nextLong();
                if (id <= 0) {
                    break;
                }
                Student student = studentService.getById(id);
                System.out.println(student.getFormattedOutput());
                System.out.println();
                System.out.println(student.getGroup().getFormattedOutput());
            }
        } finally {
            ConnectionManager.getInstance().tearDown();
        }

//        System.out.println("List of students: ");
//        StudentDao studentDao = new StudentDaoJdbcImpl();
//        List<Student> students = studentDao.getAll();
//        students.forEach(student ->
//                System.out.println(student.getId() + ": " + student.getFirstName() + " " + student.getLastName()));
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please, enter ID of the student to see detail info: ");
//        long id = scanner.nextLong();
//        Student student = studentDao.getById(id);
//        System.out.println(student.getFormattedOutput());
    }
}
