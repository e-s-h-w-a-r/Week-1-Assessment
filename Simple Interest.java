Simple Interest
package com.prodapt.Week1Assignment;

public class SimpleInterest {
static float principal = 5000.0f, rate = 3.5f, time = 2.0f, simpleInterest, totalAmount;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
simpleInterest = principal*rate*time/100;
totalAmount = principal + simpleInterest;
System.out.println("The total amount is : " + totalAmount);
	}

}