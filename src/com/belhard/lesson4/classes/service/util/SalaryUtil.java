package com.belhard.lesson4.classes.service.util;

import com.belhard.lesson4.classes.model.entities.Employee;
import com.belhard.lesson4.classes.model.entities.Employee.Position;
import com.belhard.lesson4.classes.model.entities.Teacher;
import com.belhard.lesson4.classes.model.entities.Teacher.AcademicDegree;

import java.math.BigDecimal;

public class SalaryUtil {

    public static BigDecimal allowancePosition(Employee emp) {
        Position position = emp.position;
        if (position != null) {
            BigDecimal salaryPosition = emp.getSalary();
            if (position == (Position.HEAD_OF_DEPARTMENT)) {
                salaryPosition = salaryPosition.add(BigDecimal.valueOf(300));
                return salaryPosition;
            } else if (position == (Position.DEPUTY)) {
                salaryPosition = salaryPosition.add(BigDecimal.valueOf(250));
                return salaryPosition;
            } else if (position == (Position.TEACHER)) {
                salaryPosition = salaryPosition.add(BigDecimal.valueOf(200));
                return salaryPosition;
            } else if (position == (Position.SENIOR_LECTURER)) {
                salaryPosition = salaryPosition.add(BigDecimal.valueOf(180));
                return salaryPosition;
            } else if (position == (Position.ASSISTANT)) {
                salaryPosition = salaryPosition.add(BigDecimal.valueOf(150));
                return salaryPosition;
            } else if (position == (Position.CLEANER)) {
                salaryPosition = salaryPosition.add(BigDecimal.valueOf(100));
                return salaryPosition;
            }
        } else if (position == null) {
            throw new IllegalArgumentException();
        }
        return null;
    }

    public static BigDecimal prizeEmployee(Employee emp) {
        BigDecimal prizeEmployee = emp.getSalary();
        return prizeEmployee.add(BigDecimal.valueOf(100));
    }

    public static BigDecimal allowanceVacation(Employee emp) {
        BigDecimal salaryVacation = emp.getSalary();
        salaryVacation = salaryVacation.multiply(BigDecimal.valueOf(300));
        emp.setSalary(salaryVacation);
        return salaryVacation;
    }

    public static BigDecimal increaseAcademicSalary(Teacher teacher) {
        AcademicDegree degree = teacher.academicDegree;
        if (degree != null) {
            BigDecimal salaryEmployee = teacher.getSalary();
            if (degree == (AcademicDegree.DOCTOR)) {
                salaryEmployee = salaryEmployee.add(BigDecimal.valueOf(500));
                return salaryEmployee;
            } else if (degree == (AcademicDegree.CANDIDATE)) {
                salaryEmployee = salaryEmployee.add(BigDecimal.valueOf(400));
                return salaryEmployee;
            } else if (degree == (AcademicDegree.PROFESSOR)) {
                salaryEmployee = salaryEmployee.add(BigDecimal.valueOf(300));
                return salaryEmployee;
            } else if (degree == (AcademicDegree.MASTER)) {
                salaryEmployee = salaryEmployee.add(BigDecimal.valueOf(200));
                return salaryEmployee;
            } else if (degree == (AcademicDegree.ASSISTANT_PROFESSOR)) {
                salaryEmployee = salaryEmployee.add(BigDecimal.valueOf(150));
                return salaryEmployee;
            } else if (degree == (AcademicDegree.BACHELOR_OF_BUSINESS_ADMINISTRATION)) {
                salaryEmployee = salaryEmployee.add(BigDecimal.valueOf(100));
                return salaryEmployee;
            } else {
                teacher.setSalary(salaryEmployee);
                return salaryEmployee;
            }
        }
        return null;
    }
}
