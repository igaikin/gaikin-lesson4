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
        Group group = new Group("13");
        Chair chair = new Chair("ESTABLISHING A REGIME");

        Student students0 = new Student("Muammar", "Gaddafi", new Date(),
                new Address(LBY, "Tripoli", "Tarik al Seka", 58), 1, "Tyranny", group);
        Student students1 = new Student("Osama", "bin Ladenen", new Date(),
                new Address(PAK, "Abbottabad", "Kehal", 46), 1, "Tyranny", group);
        Student students2 = new Student("Adolf", "Hitler", new Date(),
                new Address(DEU, "Berlin", "Ebertstraße", 15), 1, "Tyranny", group);
        Student students3 = new Student("Saddam", "Hussein", new Date(),
                new Address(IRQ, "Baghdad", "building without address "), 1, "Tyranny", group);
        Student students4 = new Student("Bashar", "al-Assad", new Date(),
                new Address(SYR, "Damascus", "Kafr Sousa - in front of Al-Assad Hospital"), 1, "Tyranny", group);
        Student students5 = new Student("Idi", "Amin", new Date(),
                new Address(UGA, "Kampala", "Apollo Kaggwa Rd", 9, "11"), 1, "Tyranny", group);
        Student students6 = new Student("Joseph", "Stalin", new Date(),
                new Address(USSR, "Moscow", "Kolmogorova", 1),
                1, "Tyranny", group);
        Student students7 = new Student("Alesandro", "Shoushenko", new Date(),
                new Address(BLR, "Minsk", "Pobediteley", 15), 1, "Tyranny", group);
        Teacher teacher0 = new Teacher("Irod", "Great", new Date(),
                new Address(ISR, "Herodion", "Great Palace"),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.DOCTOR,
                Employee.Position.HEAD_OF_DEPARTMENT, 75, chair, group);
        Teacher teacher1 = new Teacher("Vladimir", "Lenin", new Date(),
                new Address(USSR, "Moscow", "Red square"),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.DOCTOR,
                Employee.Position.DEPUTY, 150, chair, new Group("01"));
        Teacher teacher2 = new Teacher("Nikita", "Chruschev", new Date(),
                new Address(USSR, "Moscow", "Sadovo-spasskaya", 21),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.DOCTOR,
                Employee.Position.DEPUTY, 160, chair, new Group("2"));
        Teacher teacher3 = new Teacher("Konstantin", "Chernenko", new Date(),
                new Address(USSR, "Moscow", "Kotel'nicheskaya embankment", 1),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.CANDIDATE,
                Employee.Position.TEACHER, 32, chair, new Group("3"));
        Teacher teacher4 = new Teacher("Georgiy", "Malenkov", new Date(),
                new Address(USSR, "Moscow", "Arbat", 57),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.PROFESSOR,
                Employee.Position.TEACHER, 140, chair, new Group("4"));
        Teacher teacher5 = new Teacher("Uriy", "Andropov", new Date(),
                new Address(USSR, "Moscow", "Kudrinskaya square", 1),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.MASTER,
                Employee.Position.TEACHER, 160, chair, new Group("5"));
        Teacher teacher6 = new Teacher("Leonid", "Brezhnev", new Date(),
                new Address(USSR, "Moscow", "Kalanchevskaya", 21, "40"),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.MASTER,
                Employee.Position.TEACHER, 150, chair, new Group("6"));
        Teacher teacher7 = new Teacher("Michail", "Gorbachev", new Date(),
                new Address(USSR, "Moscow", " Kutuzovskiy Avenue", 21, "1"),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.ASSISTANT_PROFESSOR,
                Employee.Position.SENIOR_LECTURER, 140, chair, new Group("7"));
        Teacher teacher8 = new Teacher("Vladimir", "Putin", new Date(),
                new Address(RUS, "Moscow", "Kremlin"),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.ASSISTANT_PROFESSOR,
                Employee.Position.SENIOR_LECTURER, 160, chair, new Group("8"));
        Teacher teacher9 = new Teacher("Dmitriy", "Medvedev", new Date(),
                new Address(RUS, "Moscow", "Krasnopresnenskaya embankment", 2),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.BACHELOR_OF_BUSINESS_ADMINISTRATION,
                Employee.Position.ASSISTANT, 140, chair, new Group("9"));
        Cleaner cleaner = new Cleaner("Petr", "Poroshenko", new Date(),
                new Address(UKR, "Kiev", "Bankovaya", 11),
                Employee.Subdivision.WORK_STAFF, Employee.Position.CLEANER, 160, chair);

        System.out.println(group);
        System.out.println();
        System.out.println(chair);

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
    }
}
