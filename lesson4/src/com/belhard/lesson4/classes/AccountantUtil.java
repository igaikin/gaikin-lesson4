package com.belhard.lesson4.classes;

import java.math.BigDecimal;

import com.belhard.lesson4.classes.Employee.Post;
import com.belhard.lesson4.classes.Teacher.AcademicDegree;

public class AccountantUtil {

	public static void allowancePosition(Teacher teacher) {
		Post position = teacher.post;
		BigDecimal salaryPosition = teacher.getSalaryEmployee();
		if (position.equals(Post.HEAD_OF_DEPARTMENT)) {
			salaryPosition = salaryPosition.add(BigDecimal.valueOf(300));
		} else if (position.equals(Post.DEPUTY)) {
			salaryPosition = salaryPosition.add(BigDecimal.valueOf(250));
		} else if (position.equals(Post.TEACHER)) {
			salaryPosition = salaryPosition.add(BigDecimal.valueOf(200));
		} else if (position.equals(Post.SENIOR_LECTURER)) {
			salaryPosition = salaryPosition.add(BigDecimal.valueOf(150));
		} else if (position.equals(Post.ASSISTANT)) {
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
		AcademicDegree degree = teacher.academicDegree;
		BigDecimal salaryEmployee = teacher.getSalaryEmployee();
		if (degree.equals(AcademicDegree.DOCTOR)) {
			salaryEmployee = salaryEmployee.add(BigDecimal.valueOf(500));
		} else if (degree.equals(AcademicDegree.CANDIDATE)) {
			salaryEmployee = salaryEmployee.add(BigDecimal.valueOf(400));
		} else if (degree.equals(AcademicDegree.PROFESSOR)) {
			salaryEmployee = salaryEmployee.add(BigDecimal.valueOf(300));
		} else if (degree.equals(AcademicDegree.MASTER)) {
			salaryEmployee = salaryEmployee.add(BigDecimal.valueOf(200));
		} else if (degree.equals(AcademicDegree.ASSISTANT_PROFESSOR)) {
			salaryEmployee = salaryEmployee.add(BigDecimal.valueOf(150));
		} else if (degree.equals(AcademicDegree.BACHELOR_OF_BUSINES_ADMINISTRATION)) {
			salaryEmployee = salaryEmployee.add(BigDecimal.valueOf(100));
		} else {
			teacher.setSalaryEmployee(salaryEmployee);
		}
	}
}