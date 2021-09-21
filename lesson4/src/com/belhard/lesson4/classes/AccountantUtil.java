package com.belhard.lesson4.classes;

import java.math.BigDecimal;

public class AccountantUtil {

	public static void allowancePosition(Teacher teacher) {
		String position = teacher.getPost();
		BigDecimal salaryPosition = teacher.getSalaryEmployee();
		if (position.equals("Head of the Department")) {
			salaryPosition = salaryPosition.add(BigDecimal.valueOf(300));
		} else if (position.equals("Deputy")) {
			salaryPosition = salaryPosition.add(BigDecimal.valueOf(250));
		} else if (position.equals("Teacher")) {
			salaryPosition = salaryPosition.add(BigDecimal.valueOf(200));
		} else if (position.equals("Laboratory assistant")) {
			salaryPosition = salaryPosition.add(BigDecimal.valueOf(150));
		}
	}

	public static void prize≈mployee(Teacher teacher) {
		BigDecimal prizeEmployee = teacher.getSalaryEmployee();
		prizeEmployee = prizeEmployee.add(BigDecimal.valueOf(100));
	}

	public static void allowanceVacation(Teacher teacher) {
		BigDecimal salaryVacation = teacher.getSalaryEmployee();
		salaryVacation = salaryVacation.multiply(BigDecimal.valueOf(300));
		teacher.setSalaryEmployee(salaryVacation);
	}

	public static void increaseAcademicSalary(Teacher teacher) {
		String degree = teacher.getAcademicDegree();
		BigDecimal salaryEmployee = teacher.getSalaryEmployee();
		if (degree.equals("Doctor")) {
			salaryEmployee = salaryEmployee.add(BigDecimal.valueOf(500));
		} else if (degree.equals("Candidate")) {
			salaryEmployee = salaryEmployee.add(BigDecimal.valueOf(400));
		} else if (degree.equals("Professor")) {
			salaryEmployee = salaryEmployee.add(BigDecimal.valueOf(300));
		} else if (degree.equals("Master")) {
			salaryEmployee = salaryEmployee.add(BigDecimal.valueOf(100));
		}
		teacher.setSalaryEmployee(salaryEmployee);
	}
}