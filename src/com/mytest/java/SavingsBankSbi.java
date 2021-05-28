package com.mytest.java;

import java.util.Scanner;

public class SavingsBankSbi {
	
	 double balance;
	 int IntrestRate;
	 Long accountNo;
	 
	public SavingsBankSbi(double balance, int intrestRate, Long accountNo) {
		super();
		this.balance = balance;
		this.IntrestRate = intrestRate;
		this.accountNo = accountNo;
	}

	void withDraw(){
		System.out.println("Account Number:"+accountNo+"\nTotal Balance :"+balance);
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter WithDrawl Amount");
		double withDrawlAmt=sc.nextDouble();
		
		try {
			
			if (balance>=withDrawlAmt ) {			
				double availableBalance= (balance-withDrawlAmt);
				
				System.out.println("Debited Amount :" +withDrawlAmt);
				System.out.println("Transaction is Successfull \nRemaining Balance is :"+availableBalance);
		
			}
			else {
				System.out.println("Withdrawl amount exceeds from the Available Balance Or Insufficient Balance");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			}
	}
		
		
	public static void main(String[] args) {

		SavingsBankSbi obj=new SavingsBankSbi(10000.0, 2, 32054852003L);
		obj.withDraw();
	}
}
