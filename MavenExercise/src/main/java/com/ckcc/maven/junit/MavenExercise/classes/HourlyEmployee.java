package com.ckcc.maven.junit.MavenExercise.classes;

public class HourlyEmployee extends Employee {
	
	private double wage, hour;

	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hour) {
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.hour = hour;
	}
	
	public double getPaymentAmout() {
		return wage * hour;
	}

	@Override
	public String toString() {
		return super.toString() + "\t" + wage + "\t" + hour + "\t" + getPaymentAmout();
	}	
}
