package com.ckcc.maven.junit.MavenExercise.classes;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	
	private double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double getPaymentAmout() {
		return super.getPaymentAmout() + baseSalary;
	}

	@Override
	public String toString() {
		return super.toString() + "\t" + baseSalary + "\t\t" + getPaymentAmout();
	}
	
}
