package com.ckcc.maven.junit.MavenExercise.classes;

public class SalariedEmployee extends Employee{
	
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}
	
	public double getPaymentAmout() {
		return 4 * weeklySalary;
	}

	@Override
	public String toString() {
		return super.toString() + "\t" + weeklySalary + "\t\t" + getPaymentAmout();
	}

	
}
