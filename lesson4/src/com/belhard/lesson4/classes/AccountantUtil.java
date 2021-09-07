package com.belhard.lesson4.classes;

import java.math.BigDecimal;

public class AccountantUtil extends Employee {

	private AccountantUtil(String firstName, String lastName) {
		super(firstName, lastName);

	}

	private BigDecimal salary;

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

}