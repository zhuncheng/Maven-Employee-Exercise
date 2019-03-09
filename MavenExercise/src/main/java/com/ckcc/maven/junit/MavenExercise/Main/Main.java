package com.ckcc.maven.junit.MavenExercise.Main;

import java.util.ArrayList;
import java.util.Scanner;

import com.ckcc.maven.junit.MavenExercise.classes.BasePlusCommissionEmployee;
import com.ckcc.maven.junit.MavenExercise.classes.CommissionEmployee;
import com.ckcc.maven.junit.MavenExercise.classes.Employee;
import com.ckcc.maven.junit.MavenExercise.classes.HourlyEmployee;
import com.ckcc.maven.junit.MavenExercise.classes.Invoice;
import com.ckcc.maven.junit.MavenExercise.classes.SalariedEmployee;

public class Main {
	
	public static Scanner input = new Scanner(System.in);
	static ArrayList<Employee> employees = new ArrayList<Employee>();
	static ArrayList<Invoice> invoices = new ArrayList<Invoice>();	
	
	public static void main(String[] args) {
		
		String op;
		initObj();
		
		do {
			
			System.out.println("-----------------<Menu>-----------------\n");
			System.out.println("     1. Input ");
			System.out.println("     2. Output");
			System.out.println("     3. Exit");
			System.out.println("   Enter your choice: ");
			
			op = input.nextLine();
			
			switch(op) {
			case "1":
					inputInformation();
				break;
			case "2":
					showInformation();
				break;
			}
		}while(!op.equals("3"));
				
	}
	
	public static String menuInput() {
		
		String option;
		
		System.out.println("    1.Input new Commission Employee");
		System.out.println("    2.Input new Hourly Employee");
		System.out.println("    3.Input new Salaried Employee");
		System.out.println("    4.Input new Base plus Commission Employee");
		System.out.println("    5.Input new Invoice");
		System.out.println("    6.Go back to Main Menu <-");
		System.out.println("    Enter your choice: ");
		option = input.nextLine();
		return option;
	}
	
	public static String menuShow() {
		String ch;
		
		System.out.println("\n--------------------Show-----------------------\n");
		System.out.println("    1. Commission Employee");
		System.out.println("    2. Hourly Employee");
		System.out.println("    3. Salaried Employee");
		System.out.println("    4. Base plus Commission Employee");
		System.out.println("    5. Invoice Employee");
		System.out.println("    6. Go back to Main Menu <-");
		System.out.println("\n    Enter your choice: ");
		ch = input.nextLine();
		
		return ch;
	}
	
	public static void initObj() {
		employees.add(new CommissionEmployee("Shin", "Chan", "1234567", 10000, 20));
		employees.add(new HourlyEmployee("Kazama", "Kun", "7654321", 500, 100));
		employees.add(new SalariedEmployee("Boo", "Chan", "224466", 500));
		employees.add(new BasePlusCommissionEmployee("Nene", "Chan", "113355", 50000, 10, 500));
		invoices.add(new Invoice("Choco-bi", "Product of Japan", 10, 100));
		invoices.add(new Invoice("Chocolate", "Product of Japan", 10, 100));
	}
	
	public static void inputInformation() {
		String option;
		String lName, fName, socialSecurityNum;
		
		do {	
			option = menuInput();
			switch(option) {
			case "1" :
				System.out.println("Input First Name: ");  fName = input.nextLine();
				System.out.println("Input Last Name: ");  lName = input.nextLine();
				System.out.println("Input Social Security Number: "); socialSecurityNum = input.nextLine();
				System.out.println("Input Gross Sales: "); double grossSales = input.nextDouble();
				System.out.println("Input Commission Rate: "); double commisssionRate = input.nextDouble();
				
				employees.add(new CommissionEmployee(fName, lName, socialSecurityNum, grossSales, commisssionRate));
				
				input.nextLine();
			break;
				
			case "2" :
				System.out.println("Input First Name: ");  fName = input.nextLine();
				System.out.println("Input Last Name: ");  lName = input.nextLine();
				System.out.println("Input Social Security Number: "); socialSecurityNum = input.nextLine();
				System.out.println("Input Wage : "); double wage = input.nextDouble();
				System.out.println("Input Hourly: "); double hour = input.nextDouble();
				
				employees.add(new HourlyEmployee(fName, lName, socialSecurityNum, wage, hour));
				input.nextLine();
				
				break;
			case "3" :
				System.out.println("Input First Name: ");  fName = input.nextLine();
				System.out.println("Input Last Name: ");  lName = input.nextLine();
				System.out.println("Input Social Security Number: "); socialSecurityNum = input.nextLine();
				System.out.println("Input Weekly Salary: "); double weeklySalary = input.nextDouble();
				
				employees.add(new SalariedEmployee(fName, lName, socialSecurityNum, weeklySalary));
				input.nextLine();
				
				break;
				
			case "4" :
				System.out.println("Input First Name: ");  fName = input.nextLine();
				System.out.println("Input Last Name: ");  lName = input.nextLine();
				System.out.println("Input Social Security Number: "); socialSecurityNum = input.nextLine();
				System.out.println("Input Gross Sales: "); double grossSale = input.nextDouble();
				System.out.println("Input Commission Rate: "); double commisssionRate1 = input.nextDouble();
				System.out.println("Input Salary: "); double salary = input.nextDouble();
				
				employees.add(new BasePlusCommissionEmployee(fName, lName, socialSecurityNum, grossSale, commisssionRate1, salary));
				input.nextLine();
				break;
				
			case "5" :
				System.out.println("Input Part Number: "); String partNumber = input.nextLine();
				System.out.println("Input Part Description: "); String partDescription = input.nextLine();
				System.out.println("Input Qty: "); int qty = input.nextInt();
				System.out.println("Input price per ITem: "); double pricePerItem = input.nextDouble();
				
				invoices.add(new Invoice(partNumber, partDescription, qty, pricePerItem));
				input.nextLine();
				break;
			
			}
		}while(!option.equals("6"));

	}
	
	public static void showInformation() {
		String ch;
		do {
			ch = menuShow();
			
			switch (ch) {
			case "1":
					System.out.println("Show Commission Employee\n");
					System.out.println("First Name\tLast Name\tSocial Number\tGross Sale\tCommission Rate\tAmount");
					for (Employee employee : employees) {
						if((employee instanceof CommissionEmployee) && !(employee instanceof BasePlusCommissionEmployee)) {
							System.out.println(employee.toString());
						}
					}
					
					input.nextLine();
					
				break;
			case "2":
				
				System.out.println("Show Hourly Employee\n");
				
				System.out.println("First Name   Last Name\tSocail Secure Number\tWage\tHourly\tAmount\n");
				for (Employee employee : employees) {
					if(employee instanceof HourlyEmployee) {
						System.out.println(employee.toString());
					}
				}
				
				input.nextLine();
				
				break;
			case "3":
				System.out.println("Show Salaried Employee\n");
				System.out.println("First Name\tLast Name\tSocial Number\tWeekly Salary\tAmount");
				for (Employee employee : employees) {
					if(employee instanceof SalariedEmployee) {
						System.out.println(employee.toString());
					}
				}
				
				input.nextLine();
				
				break;
				
			case "4":
				
				System.out.println("Show Base plus Commission Emloyee Employee\n");
				System.out.println("First Name\tLast Name\tSocial Number\tGross Sale\tCommission Rate\tSalary\tAmount");
				for (Employee employee : employees) {
					if(employee instanceof BasePlusCommissionEmployee) {
						System.out.println(employee.toString());
					}
				}
				
				input.nextLine();
				
				break;
			case "5":
				System.out.println("Invoice\n");
				System.out.println("Test");
				for (Invoice invoice : invoices) {
					System.out.println(invoice.toString());
				}
				
				input.nextLine();
				
				break;
			default:
				break;
			}
		}while(!ch.equals("6"));

	}
	
}


