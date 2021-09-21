package com.belhard.lesson4.classes;

import java.math.BigDecimal;

public class Chair {

	private String name;
	private static Cleaner cleaner;
	private static Teacher[] teacher = new Teacher[10];
	private int quantity;

	public String toString() {
		String str = "\t*******Chair:********\n\t" + name + "\n\n";
		if (cleaner != null) {
			str = str + cleaner.toString() + "\n\n";
		}
		int util = 1;
		for (int i = 0; i < teacher.length; i++) {

			if (teacher[i] != null) {
				str = str + "\t" + util + ": " + teacher[i].toString() + "\n\n";
				util++;
			} else if (teacher[i] == null) {
				str = str + "\t" + util + ":  " + "THE EMPLOYEE IS NOT ASSIGNED\n" + "\n";
				util++;
			}

		}
		return str;
	}

	public boolean AddPerson(Teacher pers) {
		if (quantity < teacher.length) {
			for (int i = 0; i < teacher.length; i++) {
				if (teacher[i] == null) {
					teacher[i] = pers;
					quantity++;
					return true;
				}
			}
		}
		return false;
	}

	public boolean removePerson(long numberCard) {
		for (int i = 0; i < teacher.length; i++) {
			if (teacher[i] != null && teacher[i].getNumberCard() == numberCard) {
				teacher[i] = null;
				quantity--;

			}
		}
		return false;
	}

	public Teacher[] getArrayTeacher() {
		return teacher;
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
		this.cleaner = cleaner;
	}

	public void removeCleaner() {
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
