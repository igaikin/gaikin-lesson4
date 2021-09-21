package com.belhard.lesson4.classes;

import java.math.BigDecimal;

public class EntryData {

	public static void main(String[] arqs) {

		Teacher teacher0 = new Teacher("Irod", "Great", 58, "Stuff Teacher", "Teacher", 75, new BigDecimal("1000"),
				"Establishing a regime", "Doctor", 13);
		Student students1 = new Student("Muamar", "Kadaffi", 22, 1, "Tyranny", 13);
		Student students2 = new Student("Usama", "benLaden", 20, 1, "Tyranny", 13);
		Student students3 = new Student("Adolf", "Hitler", 23, 1, "Tyranny", 13);
		Student students4 = new Student("Sadam", "Husein", 18, 1, "Tyranny", 13);
		Student students5 = new Student("Bashar", "Assad", 24, 1, "Tyranny", 13);
		Student students6 = new Student("Iddi", "Amin", 22, 1, "Tyranny", 13);
		Student students7 = new Student("Josef", "Stalin", 22, 1, "Tyranny", 13);
		Student students8 = new Student("Alesandro", "Shoushenk", 22, 1, "Tyranny", 13);

		Group group = new Group();
		group.AddPerson(students1);
		group.AddPerson(students2);
		group.AddPerson(students3);
		group.AddPerson(students4);
		group.AddPerson(students5);
		group.AddPerson(students6);
		group.AddPerson(students7);
		group.AddPerson(students8);
		group.setTeacher(teacher0);
		group.setName("13");

		System.out.println(group.toString());
		System.out.println();

		Teacher teacher1 = new Teacher("Vladimir", "Lenin", 58, "Stuff Teacher", "Head of the Department", 150,
				new BigDecimal("1000"), "EAR", "Doctor", 0);
		Teacher teacher2 = new Teacher("Nikita", "Chruschev", 57, "Stuff Teacher", "Deputy", 160,
				new BigDecimal("1000"), "EAR", "Candidate", 0);
		Teacher teacher3 = new Teacher("Konstantin", "Chernenko", 56, "Stuff Teacher", "Teacher", 32,
				new BigDecimal("1000"), "EAR", "Professoe", 0);
		Teacher teacher4 = new Teacher("Georgiy", "Malenkov", 55, "Stuff Teacher", "Teacher", 140,
				new BigDecimal("1000"), "EAR", "Professor", 0);
		Teacher teacher5 = new Teacher("Uriy", "Andropov", 54, "Stuff Teacher", "Teacher", 160, new BigDecimal("1000"),
				"EAR", "Master", 0);
		Teacher teacher6 = new Teacher("Leonid", "Brezhnev", 53, "Stuff Teacher", "Teacher", 150,
				new BigDecimal("1000"), "EAR", "Master", 0);
		Teacher teacher7 = new Teacher("Michail", "Gorbachev", 52, "Stuff Teacher", "Teacher", 140,
				new BigDecimal("1000"), "EAR", "Assistant Professor", 0);
		Teacher teacher8 = new Teacher("Vladimir", "Putin", 51, "Stuff Teacher", "Laboratory assistant", 160,
				new BigDecimal("1000"), "EAR", "Assistant Professor", 0);
		Teacher teacher9 = new Teacher("Dmitriy", "Medvedev", 50, "Stuff Teacher", "Laboratory assistant", 140,
				new BigDecimal("1000"), "EAR", "Bachelor of Business Administration", 0);
		Cleaner cleaner = new Cleaner("Petr", "Poroshenko", 68, "Working stuff", "Cleaner", 160, new BigDecimal("600"),
				"All rooms of Department Establishing a regime");

		Chair chair = new Chair();
		chair.AddPerson(teacher0);
		chair.AddPerson(teacher1);
		chair.AddPerson(teacher2);
		chair.AddPerson(teacher3);
		chair.AddPerson(teacher4);
		chair.AddPerson(teacher5);
		chair.AddPerson(teacher6);
		chair.AddPerson(teacher7);
		chair.AddPerson(teacher8);
		chair.AddPerson(teacher9);
		chair.setCleaner(cleaner);

		AccountantUtil.increaseAcademicSalary(teacher0);
		AccountantUtil.increaseAcademicSalary(teacher1);
		AccountantUtil.increaseAcademicSalary(teacher2);
		AccountantUtil.increaseAcademicSalary(teacher3);
		AccountantUtil.increaseAcademicSalary(teacher4);
		AccountantUtil.increaseAcademicSalary(teacher5);
		AccountantUtil.increaseAcademicSalary(teacher6);
		AccountantUtil.increaseAcademicSalary(teacher7);
		AccountantUtil.increaseAcademicSalary(teacher8);
		AccountantUtil.increaseAcademicSalary(teacher9);
		chair.setName("ESTABLISHING A REGIME");

		System.out.println(chair);

		System.out.println("All Salaries of Chair: " + Chair.allSalaryChair(chair.getArrayTeacher()) + " BYN");
	}

}