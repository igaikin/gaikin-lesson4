package com.belhard.lesson4.classes;

import com.belhard.lesson4.classes.model.entities.Cleaner;
import com.belhard.lesson4.classes.model.entities.Employee;
import com.belhard.lesson4.classes.model.entities.Student;
import com.belhard.lesson4.classes.model.entities.Teacher;
import com.belhard.lesson4.classes.model.entities.auxiliary.Address;
import com.belhard.lesson4.classes.model.entities.auxiliary.Money;
import com.belhard.lesson4.classes.model.groups.Chair;
import com.belhard.lesson4.classes.model.groups.Group;
import com.belhard.lesson4.classes.service.util.SalaryUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Group group = new Group("13");
        Chair chair = new Chair("ESTABLISHING A REGIME");

        Student students0 = new Student("Muammar", "Gaddafi", new Date(),
                new Address(Address.Country.LBY, "Tripoli", "Tarik al Seka", 58), 1, "Tyranny", group);
        Student students1 = new Student("Osama", "bin Ladenen", new Date(),
                new Address(Address.Country.PAK, "Abbottabad", "Kehal", 46), 1, "Tyranny", group);
        Student students2 = new Student("Adolf", "Hitler", new Date(),
                new Address(Address.Country.DEU, "Berlin", "Ebertstraße", 15), 1, "Tyranny", group);
        Student students3 = new Student("Saddam", "Hussein", new Date(),
                new Address(Address.Country.IRQ, "Baghdad", "building without address "), 1, "Tyranny", group);
        Student students4 = new Student("Bashar", "al-Assad", new Date(),
                new Address(Address.Country.SYR, "Damascus", "Kafr Sousa - in front of Al-Assad Hospital"), 1, "Tyranny", group);
        Student students5 = new Student("Idi", "Amin", new Date(),
                new Address(Address.Country.UGA, "Kampala", "Apollo Kaggwa Rd", 9, "11"), 1, "Tyranny", group);
        Student students6 = new Student("Joseph", "Stalin", new Date(),
                new Address(Address.Country.USSR, "Moscow", "Kolmogorova", 1),
                1, "Tyranny", group);
        Student students7 = new Student("Alesandro", "Shoushenko", new Date(),
                new Address(Address.Country.BLR, "Minsk", "Pobediteley", 15), 1, "Tyranny", group);
        Teacher teacher0 = new Teacher("Irod", "Great", new Date(),
                new Address(Address.Country.ISR, "Herodion", "Great Palace"),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.DOCTOR,
                Employee.Position.HEAD_OF_DEPARTMENT, 75, chair, group);
        Teacher teacher1 = new Teacher("Vladimir", "Lenin", new Date(),
                new Address(Address.Country.USSR, "Moscow", "Red square"),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.DOCTOR,
                Employee.Position.DEPUTY, 150, chair, new Group("01"));
        Teacher teacher2 = new Teacher("Nikita", "Chruschev", new Date(),
                new Address(Address.Country.USSR, "Moscow", "Sadovo-spasskaya", 21),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.DOCTOR,
                Employee.Position.DEPUTY, 160, chair, new Group("2"));
        Teacher teacher3 = new Teacher("Konstantin", "Chernenko", new Date(),
                new Address(Address.Country.USSR, "Moscow", "Kotel'nicheskaya embankment", 1),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.CANDIDATE,
                Employee.Position.TEACHER, 32, chair, new Group("3"));
        Teacher teacher4 = new Teacher("Georgiy", "Malenkov", new Date(),
                new Address(Address.Country.USSR, "Moscow", "Arbat", 57),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.PROFESSOR,
                Employee.Position.TEACHER, 140, chair, new Group("4"));
        Teacher teacher5 = new Teacher("Uriy", "Andropov", new Date(),
                new Address(Address.Country.USSR, "Moscow", "Kudrinskaya square", 1),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.MASTER,
                Employee.Position.TEACHER, 160, chair, new Group("5"));
        Teacher teacher6 = new Teacher("Leonid", "Brezhnev", new Date(),
                new Address(Address.Country.USSR, "Moscow", "Kalanchevskaya", 21, "40"),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.MASTER,
                Employee.Position.TEACHER, 150, chair, new Group("6"));
        Teacher teacher7 = new Teacher("Michail", "Gorbachev", new Date(),
                new Address(Address.Country.USSR, "Moscow", " Kutuzovskiy Avenue", 21, "1"),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.ASSISTANT_PROFESSOR,
                Employee.Position.SENIOR_LECTURER, 140, chair, new Group("7"));
        Teacher teacher8 = new Teacher("Vladimir", "Putin", new Date(),
                new Address(Address.Country.RUS, "Moscow", "Kremlin"),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.ASSISTANT_PROFESSOR,
                Employee.Position.SENIOR_LECTURER, 160, chair, new Group("8"));
        Teacher teacher9 = new Teacher("Dmitriy", "Medvedev", new Date(),
                new Address(Address.Country.RUS, "Moscow", "Krasnopresnenskaya embankment", 2),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.BACHELOR_OF_BUSINESS_ADMINISTRATION,
                Employee.Position.ASSISTANT, 140, chair, new Group("9"));
        Cleaner cleaner = new Cleaner("Petr", "Poroshenko", new Date(),
                new Address(Address.Country.UKR, "Kiev", "Bankovaya", 11),
                Employee.Subdivision.WORK_STAFF, Employee.Position.CLEANER, 160, chair);

        System.out.println(group);
        System.out.println();
        System.out.println(chair);


        List<Employee> list = new ArrayList<>();
        list.add(teacher0);
        list.add(teacher1);
        list.add(teacher2);
        list.add(teacher3);
        list.add(teacher4);
        list.add(teacher5);
        list.add(teacher6);
        list.add(teacher7);
        list.add(teacher8);
        list.add(teacher9);
        list.add(cleaner);
        cleaner.getSalary().setCurrency(Money.Currency.BYN);

        list.forEach(SalaryUtil::setSalary);
        System.out.println("\n\nSALARY TEST\n\n");
        list.forEach(System.out::println);
        Money money = SalaryUtil.countTotalSalary(Money.Currency.USD, chair);
        System.out.println("\n\nTOTAL SALARY: " + money);


    }
}
