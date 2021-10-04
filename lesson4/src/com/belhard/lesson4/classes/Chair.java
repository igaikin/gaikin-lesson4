package com.belhard.lesson4.classes;

import java.math.BigDecimal;

public class Chair {

	private String name;
	private static Cleaner cleaner;
	private MyCollection teachers;

	public Chair(String name) {

		this.name = name;

		teachers = new DynamicArray();
	}

	public String toString() {
		String str = "\t*******Chair:********\n\t" + name + "\n\n";
		if (cleaner != null) {
			str = str + cleaner.toString() + "\n\n";
		}
		int util = 1;

		for (int i = 0; i < teachers.toArray().length; i++) {
			if (teachers.toArray()[i] != null) {
				str = str + "\t" + util + ":  " + teachers.toArray()[i].toString() + "\n\n";
				util++;

			} else if (teachers.toArray()[i] == null) {
				str = str + "\t" + util + ":  " + "THE EMPLOYEE IS NOT ASSIGNED\n" + "\n";
				util++;
			}

		}
		return str;
	}

	public void addTeachers(Teacher teacher) {

		teachers.add(teacher);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cleaner getCleaner() {
		return cleaner;
	}

	public void setCleaner(Cleaner cleaner) {
		Chair.cleaner = cleaner;
	}

	public void delCleaner() {
		cleaner = null;
	}

	public static BigDecimal allSalaryChair(Teacher[] teacher) {
		BigDecimal allSalaries = new BigDecimal("0");
		BigDecimal allSalary = new BigDecimal("0");
		for (int i = 0; i < teacher.length; i++) {
			if (teacher[i] != null) {
				allSalaries = allSalaries.add(teacher[i].getSalaryEmployee());

			}

		}
		allSalary = allSalaries.add(cleaner.getSalaryEmployee());
		return allSalary;
	}

}
