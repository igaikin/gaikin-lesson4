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

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Group group = new Group("13");
        Chair chair = new Chair("ESTABLISHING A REGIME");

        new Student("Muammar", "Gaddafi", LocalDate.of(1942, 6, 7),
                new Address(Address.Country.LBY, "Tripoli", "Tarik al Seka", 58), 1, "Tyranny", group);
        new Student("Osama", "bin Ladenen", LocalDate.of(1957, 3, 10),
                new Address(Address.Country.PAK, "Abbottabad", "Kehal", 46), 1, "Tyranny", group);
        new Student("Adolf", "Hitler", LocalDate.of(1889, 04, 20),
                new Address(Address.Country.DEU, "Berlin", "Ebertstraße", 15), 1, "Tyranny", group);
        new Student("Saddam", "Hussein", LocalDate.of(1931, 4, 28),
                new Address(Address.Country.IRQ, "Baghdad", "building without address "), 1, "Tyranny", group);
        new Student("Bashar", "al-Assad", LocalDate.of(1965, 9, 11),
                new Address(Address.Country.SYR, "Damascus", "Kafr Sousa - in front of Al-Assad Hospital"), 1,
                "Tyranny", group);
        new Student("Idi", "Amin", LocalDate.of(1925, 05, 17),
                new Address(Address.Country.UGA, "Kampala", "Apollo Kaggwa Rd", 9, "11"), 1, "Tyranny", group);
        new Student("Joseph", "Stalin", LocalDate.of(1878, 12, 18),
                new Address(Address.Country.USSR, "Moscow", "Kolmogorova", 1),
                1, "Tyranny", group);
        new Student("Alesandro", "Shoushenko", LocalDate.of(1954, 8, 30),
                new Address(Address.Country.BLR, "Minsk", "Pobediteley", 15), 1, "Tyranny", group);
        Teacher teacher0 = new Teacher("Irod", "Great", LocalDate.of(74, Month.JANUARY, 1),
                new Address(Address.Country.ISR, "Herodion", "Great Palace"),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.DOCTOR,
                Employee.Position.HEAD_OF_DEPARTMENT, 75, chair, group);
        Teacher teacher1 = new Teacher("Vladimir", "Lenin", LocalDate.of(1870, 4, 22),
                new Address(Address.Country.USSR, "Moscow", "Red square"),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.DOCTOR,
                Employee.Position.DEPUTY, 150, chair, new Group("01"));
        Teacher teacher2 = new Teacher("Nikita", "Chruschev", LocalDate.of(1894, 4, 15),
                new Address(Address.Country.USSR, "Moscow", "Sadovo-spasskaya", 21),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.DOCTOR,
                Employee.Position.DEPUTY, 160, chair, new Group("2"));
        Teacher teacher3 = new Teacher("Konstantin", "Chernenko", LocalDate.of(1911, 9, 24),
                new Address(Address.Country.USSR, "Moscow", "Kotel'nicheskaya embankment", 1),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.CANDIDATE,
                Employee.Position.TEACHER, 32, chair, new Group("3"));
        Teacher teacher4 = new Teacher("Georgiy", "Malenkov", LocalDate.of(1902, 1, 8),
                new Address(Address.Country.USSR, "Moscow", "Arbat", 57),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.PROFESSOR,
                Employee.Position.TEACHER, 140, chair, new Group("4"));
        Teacher teacher5 = new Teacher("Uriy", "Andropov", LocalDate.of(1914, 6, 15),
                new Address(Address.Country.USSR, "Moscow", "Kudrinskaya square", 1),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.MASTER,
                Employee.Position.TEACHER, 160, chair, new Group("5"));
        Teacher teacher6 = new Teacher("Leonid", "Brezhnev", LocalDate.of(1906, 12, 19),
                new Address(Address.Country.USSR, "Moscow", "Kalanchevskaya", 21, "40"),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.MASTER,
                Employee.Position.TEACHER, 150, chair, new Group("6"));
        Teacher teacher7 = new Teacher("Michail", "Gorbachev", LocalDate.of(1931, 3, 2),
                new Address(Address.Country.USSR, "Moscow", " Kutuzovskiy Avenue", 21, "1"),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.ASSISTANT_PROFESSOR,
                Employee.Position.SENIOR_LECTURER, 140, chair, new Group("7"));
        Teacher teacher8 = new Teacher("Vladimir", "Putin", LocalDate.of(1952, 10, 7),
                new Address(Address.Country.RUS, "Moscow", "Kremlin"),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.ASSISTANT_PROFESSOR,
                Employee.Position.SENIOR_LECTURER, 160, chair, new Group("8"));
        Teacher teacher9 = new Teacher("Dmitriy", "Medvedev", LocalDate.of(1965, 9, 14),
                new Address(Address.Country.RUS, "Moscow", "Krasnopresnenskaya embankment", 2),
                Employee.Subdivision.TEACHERS_STAFF, Teacher.AcademicDegree.BACHELOR,
                Employee.Position.ASSISTANT, 140, chair, new Group("9"));
        Cleaner cleaner = new Cleaner("Petr", "Poroshenko", LocalDate.of(1965, 9, 26),
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
//        cleaner.getSalary().setCurrency(Money.Currency.BYN);

        list.forEach(SalaryUtil::setSalary);
        System.out.println("\n\nSALARY TEST\n\n");
        list.forEach(System.out::println);
        Money money = SalaryUtil.countTotalSalary(Money.Currency.USD, chair);
        System.out.println("\n\nTOTAL SALARY: " + money);


    }
}
