package com.ckcc.maven.junit.MavenExercise;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ckcc.maven.junit.MavenExercise.classes.BasePlusCommissionEmployee;
import com.ckcc.maven.junit.MavenExercise.classes.CommissionEmployee;
import com.ckcc.maven.junit.MavenExercise.classes.HourlyEmployee;
import com.ckcc.maven.junit.MavenExercise.classes.Invoice;
import com.ckcc.maven.junit.MavenExercise.classes.SalariedEmployee;

public class PaymentTest {
	
	Invoice invoice;
	CommissionEmployee comEmp;
	SalariedEmployee salariedEmp;
	HourlyEmployee hourLyEmp;
	BasePlusCommissionEmployee basePlusComEmp;
	
	@Test
	public void testGetPaymentAmoutInvoice() {
		invoice = new Invoice("aaa", "aaa", 10, 100);
		assertEquals(1000, invoice.getPaymentAmout(), 0.0);	
	}
	
	@Test
	public void testGetPaymentAmoutComEmp() {
		comEmp = new CommissionEmployee("Shin", "Chan", "112266", 10000, 10);
		assertEquals(1000, comEmp.getPaymentAmout(), 0.0);
		
	}
	@Test
	public void testGetPaymentAmoutSalEmp() {
		salariedEmp = new SalariedEmployee("aaa", "Chan", "112233", 50);
		assertEquals(200, salariedEmp.getPaymentAmout(), 0.0);
	}
	
	@Test
	public void testGetPaymentAmoutHourlyEmp() {
		hourLyEmp = new HourlyEmployee("shin", "Chan", "112244", 200, 10);
		assertEquals(2000, hourLyEmp.getPaymentAmout(), 0.0);
	}
	
	@Test
	public void testGetPaymentAmoutBasePlusComEmp() {
		basePlusComEmp = new BasePlusCommissionEmployee("shin", "Chan", "112255", 5000, 10, 500);
		assertEquals(1000, basePlusComEmp.getPaymentAmout(), 0.0);
	}

}
