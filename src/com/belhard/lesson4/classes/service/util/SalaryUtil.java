package com.belhard.lesson4.classes.service.util;

import com.belhard.lesson4.classes.model.entities.Cleaner;
import com.belhard.lesson4.classes.model.entities.Employee;
import com.belhard.lesson4.classes.model.entities.Employee.Position;
import com.belhard.lesson4.classes.model.entities.Teacher;
import com.belhard.lesson4.classes.model.entities.Teacher.AcademicDegree;
import com.belhard.lesson4.classes.model.entities.auxiliary.Money;
import com.belhard.lesson4.classes.model.groups.Chair;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class SalaryUtil {

    public static void setSalary(Employee employee) {//FIXME currency, log4j, create DB (DDL) CREATE, StarUML (ER Diagram)
        BigDecimal amount = getBaseSalary(employee);
        amount = amount.add(countPositionAllowance(employee));
        amount = amount.add(countEmployeeBonus(employee));
        if (employee instanceof Teacher) {
            amount = amount.add(countAcademicAllowance((Teacher) employee));
        }
        employee.setSalary(new Money(amount, employee.getSalary().getCurrency()));
    }

    public static Money countTotalSalary(Money.Currency target, Chair chair) {
        if (chair.getCleaner() != null) {
            Object[] objects = Arrays.copyOf(chair.getTeachers(), chair.getTeachers().length + 1);
            objects[objects.length - 1] = chair.getCleaner();
            return countTotalSalary(target, objects);
        } else {
            return countTotalSalary(target, chair.getTeachers());
        }
    }

    private static Money countTotalSalary(Money.Currency target, Object... employees) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Object element : employees) {
            if (element instanceof Employee) {
                Employee employee = (Employee) element;
                BigDecimal amount = exchange(employee.getSalary(), target);
                sum = sum.add(amount);
            }
        }
        return new Money(sum, target);

    }

    private static BigDecimal exchange(Money salary, Money.Currency target) {
        BigDecimal amount = salary.getAmount();
        Money.Currency currency = salary.getCurrency();
        amount = amount.divide(currency.getExchangeRate(), RoundingMode.HALF_EVEN);

        amount = amount.multiply(target.getExchangeRate());
        return amount;
    }

    private static BigDecimal getBaseSalary(Employee employee) {
        if (employee instanceof Teacher) {
            return BigDecimal.valueOf(500);
        } else if (employee instanceof Cleaner) {
            return BigDecimal.valueOf(350);
        } else {
            return BigDecimal.valueOf(300);
        }
    }

    private static BigDecimal countPositionAllowance(Employee emp) {
        Position position = emp.getPosition();
        if (position == null) {
            throw new IllegalArgumentException();
        }

        BigDecimal amount = emp.getSalary().getAmount();
        switch (position) {
            case HEAD_OF_DEPARTMENT:
                return amount.add(BigDecimal.valueOf(300));
            case DEPUTY:
                return amount.add(BigDecimal.valueOf(250));
            case TEACHER:
                return amount.add(BigDecimal.valueOf(200));
            case SENIOR_LECTURER:
                return amount.add(BigDecimal.valueOf(180));
            case ASSISTANT:
                return amount.add(BigDecimal.valueOf(150));
            case CLEANER:
                return amount.add(BigDecimal.valueOf(100));
            default:
                return amount.add(BigDecimal.valueOf(50));
        }
    }

    private static BigDecimal countEmployeeBonus(Employee emp) {
        BigDecimal amount = emp.getSalary().getAmount();
        return amount.add(BigDecimal.valueOf(100));
    }

//    private static BigDecimal allowanceVacation(Employee emp) {
//        BigDecimal salaryVacation = emp.getSalary().getAmount();
//        salaryVacation = salaryVacation.multiply(BigDecimal.valueOf(300));
//        emp.setSalary(salaryVacation);
//        return salaryVacation;
//    }

    private static BigDecimal countAcademicAllowance(Teacher teacher) {
        AcademicDegree degree = teacher.getAcademicDegree();
        if (degree == null) {
            throw new IllegalArgumentException();
        }
        BigDecimal amount = teacher.getSalary().getAmount();
        switch (degree) {
            case DOCTOR:
                return amount.add(BigDecimal.valueOf(500));
            case CANDIDATE:
                return amount.add(BigDecimal.valueOf(400));
            case PROFESSOR:
                return amount.add(BigDecimal.valueOf(300));
            case MASTER:
                return amount.add(BigDecimal.valueOf(200));
            case ASSISTANT_PROFESSOR:
                return amount.add(BigDecimal.valueOf(150));
            case BACHELOR_OF_BUSINESS_ADMINISTRATION:
                return amount.add(BigDecimal.valueOf(100));
            default:
                return amount.add(BigDecimal.valueOf(50));
        }
    }
}
