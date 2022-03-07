package com.demo;

public class Loan_Check extends Loan_Class {
	
	public static void main (String[]args) {
		
		Loan_Check ob = new Loan_Check();
		ob.setLoanAmount(100);
		System.out.println(ob.getLoanAmount());
		
	//}

	Loan_Check obj = new Loan_Check();
	obj.setStdId(3);
	System.out.println( obj.getStdId());
	
}
}