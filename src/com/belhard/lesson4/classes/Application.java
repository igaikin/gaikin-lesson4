package com.belhard.lesson4.classes;

import com.belhard.lesson4.classes.model.entities.*;
import com.belhard.lesson4.classes.model.groups.*;
import com.belhard.lesson4.classes.service.util.AccountantUtil;

import java.math.BigDecimal;
import java.util.Date;

public class Application {

    public static void main(String[] args) {
        //FIXME add Address {String city, street, int house, String block, int flat ...}
        Group group = new Group("13");
        Teacher teacher0 = new Teacher("Irod", "Great", new Date(), Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.DOCTOR,
                Employee.Position.HEAD_OF_DEPARTMENT, 75, "Establishing a regime", group);
        Student students1 = new Student("Muamar", "Kadaffi", new Date(), 1, "Tyranny", group);
        Student students2 = new Student("Usama", "benLaden", new Date(), 1, "Tyranny", group);
        Student students3 = new Student("Adolf", "Hitler", new Date(), 1, "Tyranny", group);
        Student students4 = new Student("Sadam", "Husein", new Date(), 1, "Tyranny", group);
        Student students5 = new Student("Bashar", "Assad", new Date(), 1, "Tyranny", group);
        Student students6 = new Student("Iddi", "Amin", new Date(), 1, "Tyranny", group);
        Student students7 = new Student("Josef", "Stalin", new Date(), 1, "Tyranny", group);
        Student students8 = new Student("Alesandro", "Shoushenk", new Date(), 1, "Tyranny", group);

        Teacher teacher1 = new Teacher("Vladimir", "Lenin", new Date(), Employee.Subdivision.TEACHERS_STAFF,
                Teacher.AcademicDegree.DOCTOR, Employee.Position.DEPUTY, 150, "EAR", new Group(null));
        Teacher teacher2 = new Teacher("Nikita", "Chruschev", new Date(), Employee.Subdivision.TEACHERS_STAFF,
                Teacher.AcademicDegree.DOCTOR, Employee.Position.DEPUTY, 160, "EAR", new Group(null));
        Teacher teacher3 = new Teacher("Konstantin", "Chernenko", new Date(), Employee.Subdivision.TEACHERS_STAFF,
                Teacher.AcademicDegree.CANDIDATE, Employee.Position.TEACHER, 32, "EAR", new Group(null));
        Teacher teacher4 = new Teacher("Georgiy", "Malenkov", new Date(), Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.PROFESSOR,
                Employee.Position.TEACHER, 140, "EAR", new Group(null));
        Teacher teacher5 = new Teacher("Uriy", "Andropov", new Date(), Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.MASTER,
                Employee.Position.TEACHER, 160, "EAR", new Group(null));
        Teacher teacher6 = new Teacher("Leonid", "Brezhnev", new Date(), Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.MASTER,
                Employee.Position.TEACHER, 150, "EAR", new Group(null));
        Teacher teacher7 = new Teacher("Michail", "Gorbachev", new Date(), Employee.Subdivision.TEACHERS_STAFF,
                Teacher.AcademicDegree.ASSISTANT_PROFESSOR, Employee.Position.SENIOR_LECTURER, 140, "EAR", new Group(null));
        Teacher teacher8 = new Teacher("Vladimir", "Putin", new Date(), Employee.Subdivision.TEACHERS_STAFF,
                Teacher.AcademicDegree.ASSISTANT_PROFESSOR, Employee.Position.SENIOR_LECTURER, 160, "EAR", new Group(null));
        Teacher teacher9 = new Teacher("Dmitriy", "Medvedev", new Date(), Employee.Subdivision.TEACHERS_STAFF,
                Teacher.AcademicDegree.BACHELOR_OF_BUSINESS_ADMINISTRATION, Employee.Position.ASSISTANT, 140, "EAR",
                new Group(null));
        Cleaner cleaner = new Cleaner("Petr", "Poroshenko", new Date(), Employee.Subdivision.WORK_STAFF,
                Employee.Position.CLEANER, 160,
                "All rooms of Department Establishing a regime");

        teacher0.setSalary(BigDecimal.valueOf(500));
        teacher0.setSalary(AccountantUtil.allowancePosition(teacher0));
        AccountantUtil.increaseAcademicSalary(teacher0);

        System.out.println(group);
        System.out.println();

        Chair chair = new Chair("ESTABLISHING A REGIME");
        chair.setCleaner(cleaner);
        chair.addTeachers(teacher0);
        chair.addTeachers(teacher1);
        chair.addTeachers(teacher2);
        chair.addTeachers(teacher3);
        chair.addTeachers(teacher4);
        chair.addTeachers(teacher5);
        chair.addTeachers(teacher6);
        chair.addTeachers(teacher7);
        chair.addTeachers(teacher8);
        chair.addTeachers(teacher9);

        teacher1.setSalary(BigDecimal.valueOf(500));
        teacher2.setSalary(BigDecimal.valueOf(500));
        teacher3.setSalary(BigDecimal.valueOf(500));
        teacher4.setSalary(BigDecimal.valueOf(500));
        teacher5.setSalary(BigDecimal.valueOf(500));
        teacher6.setSalary(BigDecimal.valueOf(500));
        teacher7.setSalary(BigDecimal.valueOf(500));
        teacher8.setSalary(BigDecimal.valueOf(500));
        teacher9.setSalary(BigDecimal.valueOf(500));
        cleaner.setSalary(BigDecimal.valueOf(350));
        teacher1.setSalary(AccountantUtil.allowancePosition(teacher1));
        teacher2.setSalary(AccountantUtil.allowancePosition(teacher2));
        teacher3.setSalary(AccountantUtil.allowancePosition(teacher3));
        teacher4.setSalary(AccountantUtil.allowancePosition(teacher4));
        teacher5.setSalary(AccountantUtil.allowancePosition(teacher5));
        teacher6.setSalary(AccountantUtil.allowancePosition(teacher6));
        teacher7.setSalary(AccountantUtil.allowancePosition(teacher7));
        teacher8.setSalary(AccountantUtil.allowancePosition(teacher8));
        teacher9.setSalary(AccountantUtil.allowancePosition(teacher9));

        AccountantUtil.increaseAcademicSalary(teacher1);
        AccountantUtil.increaseAcademicSalary(teacher2);
        AccountantUtil.increaseAcademicSalary(teacher3);
        AccountantUtil.increaseAcademicSalary(teacher4);
        AccountantUtil.increaseAcademicSalary(teacher5);
        AccountantUtil.increaseAcademicSalary(teacher6);
        AccountantUtil.increaseAcademicSalary(teacher7);
        AccountantUtil.increaseAcademicSalary(teacher8);
        AccountantUtil.increaseAcademicSalary(teacher9);


        System.out.println(chair);

    }
}