package com.exceptionconcept;
		//by using 3 rules we can develop user defined exceptions 1)Extend with Exception,2)Constructor,3)Super keyword
		//here Exception is a predefined Class
public class EmployeNegativeSalaryExceptionConcept extends Exception {
	
	public EmployeNegativeSalaryExceptionConcept(String str) {
		// TODO Auto-generated constructor stub
		super (str);

	
	}
}
