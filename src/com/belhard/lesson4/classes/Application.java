package com.belhard.lesson4.classes;

import com.belhard.lesson4.classes.model.entities.Cleaner;
import com.belhard.lesson4.classes.model.entities.Employee;
import com.belhard.lesson4.classes.model.entities.Student;
import com.belhard.lesson4.classes.model.entities.Teacher;
import com.belhard.lesson4.classes.model.entities.auxiliary.Address;
import com.belhard.lesson4.classes.model.groups.Chair;
import com.belhard.lesson4.classes.model.groups.Group;
import com.belhard.lesson4.classes.service.util.AccountantUtil;

import java.math.BigDecimal;
import java.util.Date;

import static com.belhard.lesson4.classes.model.entities.auxiliary.Address.Country.*;

public class Application {


    public static void main(String[] args) {
        //FIXME add Address {String city, street, int house, String block, int flat ...}
        Group group = new Group("13");
        Chair chair = new Chair("ESTABLISHING A REGIME");

        //FIXME HOTFIX
        Address address = new Address(BLR, "Minsk", "Nezalezhnosti", 17);

        Teacher teacher0 = new Teacher("Irod", "Great", new Date(), address,
                Employee.Subdivision.TEACHERS_STAFF,
                Teacher.AcademicDegree.DOCTOR,
                Employee.Position.HEAD_OF_DEPARTMENT, 75, "Establishing a regime", group);
        Student students1 = new Student("Muamar", "Kadaffi", new Date(), address, 1, "Tyranny", group);
        Student students2 = new Student("Usama", "benLaden", new Date(), address, 1, "Tyranny", group);
        Student students3 = new Student("Adolf", "Hitler", new Date(), address, 1, "Tyranny", group);
        Student students4 = new Student("Sadam", "Husein", new Date(), address, 1, "Tyranny", group);
        Student students5 = new Student("Bashar", "Assad", new Date(), address, 1, "Tyranny", group);
        Student students6 = new Student("Iddi", "Amin", new Date(), address, 1, "Tyranny", group);
        Student students7 = new Student("Josef", "Stalin", new Date(), address, 1, "Tyranny", group);
        Student students8 = new Student("Alesandro", "Shoushenk", new Date(), address, 1, "Tyranny", group);

        Teacher teacher1 = new Teacher("Vladimir", "Lenin", new Date(), address,
                Employee.Subdivision.TEACHERS_STAFF,
                Teacher.AcademicDegree.DOCTOR, Employee.Position.DEPUTY, 150, "EAR", new Group("01"));
        Teacher teacher2 = new Teacher("Nikita", "Chruschev", new Date(), address, Employee.Subdivision.TEACHERS_STAFF,
                Teacher.AcademicDegree.DOCTOR, Employee.Position.DEPUTY, 160, "EAR", new Group("02"));
        Teacher teacher3 = new Teacher("Konstantin", "Chernenko", new Date(), address, Employee.Subdivision.TEACHERS_STAFF,
                Teacher.AcademicDegree.CANDIDATE, Employee.Position.TEACHER, 32, "EAR", new Group("03"));
        Teacher teacher4 = new Teacher("Georgiy", "Malenkov", new Date(), address, Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.PROFESSOR,
                Employee.Position.TEACHER, 140, "EAR", new Group("04"));
        Teacher teacher5 = new Teacher("Uriy", "Andropov", new Date(), address, Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.MASTER,
                Employee.Position.TEACHER, 160, "EAR", new Group("05"));
        Teacher teacher6 = new Teacher("Leonid", "Brezhnev", new Date(), address, Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.MASTER,
                Employee.Position.TEACHER, 150, "EAR", new Group("06"));
        Teacher teacher7 = new Teacher("Michail", "Gorbachev", new Date(), address, Employee.Subdivision.TEACHERS_STAFF,
                Teacher.AcademicDegree.ASSISTANT_PROFESSOR, Employee.Position.SENIOR_LECTURER, 140, "EAR", new Group("07"));
        Teacher teacher8 = new Teacher("Vladimir", "Putin", new Date(), address, Employee.Subdivision.TEACHERS_STAFF,
                Teacher.AcademicDegree.ASSISTANT_PROFESSOR, Employee.Position.SENIOR_LECTURER, 160, "EAR", new Group("08"));
        Teacher teacher9 = new Teacher("Dmitriy", "Medvedev", new Date(), address, Employee.Subdivision.TEACHERS_STAFF,
                Teacher.AcademicDegree.BACHELOR_OF_BUSINESS_ADMINISTRATION, Employee.Position.ASSISTANT, 140, "EAR",
                new Group("09"));
        Cleaner cleaner = new Cleaner("Petr", "Poroshenko", new Date(), address, Employee.Subdivision.WORK_STAFF,
                Employee.Position.CLEANER, 160,
                "All rooms of Department Establishing a regime");

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

        System.out.println(group);
        System.out.println();

        teacher0.setSalary(BigDecimal.valueOf(500).add(AccountantUtil.allowancePosition(teacher0)
                .add(AccountantUtil.increaseAcademicSalary(teacher0).add(AccountantUtil.prizeEmployee(teacher0)))));
        teacher1.setSalary(BigDecimal.valueOf(500).add(AccountantUtil.allowancePosition(teacher1)
                .add(AccountantUtil.increaseAcademicSalary(teacher1).add(AccountantUtil.prizeEmployee(teacher1)))));
        teacher2.setSalary(BigDecimal.valueOf(500).add(AccountantUtil.allowancePosition(teacher2)
                .add(AccountantUtil.increaseAcademicSalary(teacher2).add(AccountantUtil.prizeEmployee(teacher2)))));
        teacher3.setSalary(BigDecimal.valueOf(500).add(AccountantUtil.allowancePosition(teacher3)
                .add(AccountantUtil.increaseAcademicSalary(teacher3).add(AccountantUtil.prizeEmployee(teacher3)))));
        teacher4.setSalary(BigDecimal.valueOf(500).add(AccountantUtil.allowancePosition(teacher4)
                .add(AccountantUtil.increaseAcademicSalary(teacher4).add(AccountantUtil.prizeEmployee(teacher4)))));
        teacher5.setSalary(BigDecimal.valueOf(500).add(AccountantUtil.allowancePosition(teacher5)
                .add(AccountantUtil.increaseAcademicSalary(teacher5).add(AccountantUtil.prizeEmployee(teacher5)))));
        teacher6.setSalary(BigDecimal.valueOf(500).add(AccountantUtil.allowancePosition(teacher6)
                .add(AccountantUtil.increaseAcademicSalary(teacher6).add(AccountantUtil.prizeEmployee(teacher6)))));
        teacher7.setSalary(BigDecimal.valueOf(500).add(AccountantUtil.allowancePosition(teacher7)
                .add(AccountantUtil.increaseAcademicSalary(teacher7).add(AccountantUtil.prizeEmployee(teacher7)))));
        teacher8.setSalary(BigDecimal.valueOf(500).add(AccountantUtil.allowancePosition(teacher8)
                .add(AccountantUtil.increaseAcademicSalary(teacher8).add(AccountantUtil.prizeEmployee(teacher8)))));
        teacher9.setSalary(BigDecimal.valueOf(500).add(AccountantUtil.allowancePosition(teacher9)
                .add(AccountantUtil.increaseAcademicSalary(teacher9).add(AccountantUtil.prizeEmployee(teacher9)))));

        cleaner.setSalary(BigDecimal.valueOf(350).add(AccountantUtil.prizeEmployee(cleaner)));

        System.out.println(chair);

    }
}
