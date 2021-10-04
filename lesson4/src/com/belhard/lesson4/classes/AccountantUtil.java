package com.belhard.lesson4.classes;

import java.math.BigDecimal;

import com.belhard.lesson4.classes.Employee.Post;
import com.belhard.lesson4.classes.Teacher.AcademicDegree;

public class AccountantUtil {

	public static BigDecimal allowancePosition(Employee emp) {
		Post position = emp.post;
		if (position != null) {
			BigDecimal salaryPosition = emp.getSalaryEmployee();
			if (position == (Post.HEAD_OF_DEPARTMENT)) {
				salaryPosition = salaryPosition.add(BigDecimal.valueOf(300));
				return salaryPosition;
			} else if (position == (Post.DEPUTY)) {
				salaryPosition = salaryPosition.add(BigDecimal.valueOf(250));
				return salaryPosition;
			} else if (position == (Post.TEACHER)) {
				salaryPosition = salaryPosition.add(BigDecimal.valueOf(200));
				return salaryPosition;
			} else if (position == (Post.SENIOR_LECTURER)) {
				salaryPosition = salaryPosition.add(BigDecimal.valueOf(150));
				return salaryPosition;
			} else if (position == (Post.ASSISTANT)) {
				salaryPosition = salaryPosition.add(BigDecimal.valueOf(150));
				return salaryPosition;
			} else if (position == (Post.CLEANER)) {
				salaryPosition = salaryPosition.add(BigDecimal.valueOf(50));
				return salaryPosition;
			}
		} else if (position == null) {
			throw new IllegalArgumentException();
		}
		return null;

	}

	public static BigDecimal prize≈mployee(Employee emp) {
		BigDecimal prizeEmployee = emp.getSalaryEmployee();
		return prizeEmployee = prizeEmployee.add(BigDecimal.valueOf(100));
	}

	public static BigDecimal allowanceVacation(Employee emp) {
		BigDecimal salaryVacation = emp.getSalaryEmployee();
		salaryVacation = salaryVacation.multiply(BigDecimal.valueOf(300));
		emp.setSalaryEmployee(salaryVacation);
		return salaryVacation;
	}

	public static BigDecimal increaseAcademicSalary(Teacher teacher) {
		AcademicDegree degree = teacher.academicDegree;
		if (degree != null) {
			BigDecimal salaryEmployee = teacher.getSalaryEmployee();
			if (degree.equals(AcademicDegree.DOCTOR)) {
				salaryEmployee = salaryEmployee.add(BigDecimal.valueOf(500));
				return salaryEmployee;
			} else if (degree.equals(AcademicDegree.CANDIDATE)) {
				salaryEmployee = salaryEmployee.add(BigDecimal.valueOf(400));
				return salaryEmployee;
			} else if (degree.equals(AcademicDegree.PROFESSOR)) {
				salaryEmployee = salaryEmployee.add(BigDecimal.valueOf(300));
				return salaryEmployee;
			} else if (degree.equals(AcademicDegree.MASTER)) {
				salaryEmployee = salaryEmployee.add(BigDecimal.valueOf(200));
				return salaryEmployee;
			} else if (degree.equals(AcademicDegree.ASSISTANT_PROFESSOR)) {
				salaryEmployee = salaryEmployee.add(BigDecimal.valueOf(150));
				return salaryEmployee;
			} else if (degree.equals(AcademicDegree.BACHELOR_OF_BUSINES_ADMINISTRATION)) {
				salaryEmployee = salaryEmployee.add(BigDecimal.valueOf(100));
				return salaryEmployee;
			} else {
				teacher.setSalaryEmployee(salaryEmployee);
				return salaryEmployee;
			}
		}
		return null;

	}

}
