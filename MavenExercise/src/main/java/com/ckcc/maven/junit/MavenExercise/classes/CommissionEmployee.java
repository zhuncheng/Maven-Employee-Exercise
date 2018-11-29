package com.ckcc.maven.junit.MavenExercise.classes;

public class CommissionEmployee extends Employee {
	
	private double grossSales, commissionRate;

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public double getPaymentAmout() {
		return grossSales * (commissionRate/100);
	}

	@Override
	public String toString() {
		return super.toString() + "\t" + grossSales + "\t\t" + commissionRate + "\t\t" + getPaymentAmout();
	}

}
