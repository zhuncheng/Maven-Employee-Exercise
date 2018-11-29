package com.ckcc.maven.junit.MavenExercise.classes;

import com.ckcc.maven.junit.MavenExercise.Interface.Payable;

public abstract class Employee implements Payable{
	
	private String firstName, lastName, socialSecurityNumber;

	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString() {
		return firstName + "\t\t" + lastName + "\t\t" + socialSecurityNumber + "\t";
	}
}
