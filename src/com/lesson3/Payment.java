package com.lesson3;
//calculate salary payment based on working hours(standart hr, overtime hr)

public class Payment {

	//declare instance variables for the values to be calculated
	
	private double standartPay;
	private double overtimePay;
	private double totalPay;
	
	//declare a method with 3 parameters to calculate the payment
	public void calculatePayment(double payRate, double standartHours, double overtimeHours){
		
		//calculate the overtime payment
		standartPay = payRate * standartHours;
		double overtimePayRate = payRate * 1.5;
		
		overtimePay = overtimePayRate * overtimeHours;
		
		totalPay = standartPay + overtimePay;
	}

	public void displayPayment(){
		System.out.println("My standart pay: " + standartPay);
		System.out.println("My overtime pay: " + overtimePay);
		System.out.println("My total pay: " + totalPay);
	}
	
	public static void main(String[] args) {
		//declare a variable of type of Payment
		Payment myPayment;
		
		//create an object of type of Payment
		myPayment = new Payment();
		
//		double pR, sH, oH;
//		pR = 20;
//		sH = 40;
//		oH = 20;
//		
//		myPayment.calculatePayment(pR, sH, oH);
//		myPayment.displayPayment();
		
		myPayment.calculatePayment(19.5, 35, 12);
		myPayment.displayPayment();
		
	}//end main

} //end class
