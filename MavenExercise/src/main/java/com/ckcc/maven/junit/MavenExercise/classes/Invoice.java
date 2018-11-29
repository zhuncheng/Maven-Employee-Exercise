package com.ckcc.maven.junit.MavenExercise.classes;

import com.ckcc.maven.junit.MavenExercise.Interface.Payable;

public class Invoice implements Payable{

	private String partNumber, partDescription;
	private int qty;
	private double pricePerItem;
	
	public Invoice(String partNumber, String partDescription, int qty, double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.qty = qty;
		this.pricePerItem = pricePerItem;
	}
	

	public double getPaymentAmout() {
		return qty * pricePerItem;
	}

	@Override
	public String toString() {
		return partNumber + "\t" + partDescription + "\t" + qty + "\t" + pricePerItem + "\t" + getPaymentAmout();
	}
}
