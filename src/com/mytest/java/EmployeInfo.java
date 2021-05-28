package com.mytest.java;

import java.util.Scanner;

public class EmployeInfo {
	
	String empname;
	int idnum;
	double salary;
	String mail;
	
	@Override
	public String toString() {
		return "EmployeInfo [empname=" + empname + ", idnum=" + idnum + ", salary=" + salary + ", mail=" + mail + "]";
	}
	
	public EmployeInfo(String empname, int idnum, double salary, String mail) {
		super();
		this.empname = empname;
		this.idnum = idnum;
		this.salary = salary;
		this.mail = mail;
		
	}
	
		public static void main(String[] args) {
		
		EmployeInfo obj=new EmployeInfo("Sree", 22982, 78927, "sr@gmail.com");
		EmployeInfo obj1=new EmployeInfo("nivas", 12566, 674864, "sr@gmail.com");
		EmployeInfo obj2=new EmployeInfo("Sreeni", 67834, 234879, "sr@gmail.com");
	
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
		/*Scanner sc=new Scanner(System.in);
		System.out.println(" employe name");
		String empname=sc.next();
		System.out.println(" employe Id number \t"); 
		int n=sc.nextInt();
		System.out.println("employ salary");
		double d=sc.nextDouble();
		System.out.println("employ mail id");
		String S=sc.next();
		System.out.println(S);*/				// if we use method name like (S) here, the input will be stored in output
	}

}
