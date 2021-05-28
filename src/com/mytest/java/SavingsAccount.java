package com.mytest.java;

import java.util.Scanner;

public class SavingsAccount {
	
	 double balance;
	 int IntrestRate;
	 Long accountNo;
	 
	public SavingsAccount(double balance, int intrestRate, Long accountNo) {
		super();
		this.balance = balance;
		this.IntrestRate = intrestRate;
		this.accountNo = accountNo;
	}
	 
	/*@Override
	public String toString() {
		return "SavingsAccount [balance=" + balance + ", IntrestRate=" + IntrestRate + ", accountNo=" + accountNo + "]";
	}*/

	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}

	void withDraw(){
		Scanner sc=new Scanner(System.in);
		double withDrawlAmt=sc.nextDouble();
		
		
		double withDrawlAmount=1000.0;
		try {
			
			/*//with this logic we are displaying the remaining balance from the total amount with intrest..
			 * int intrestAmount= (int) (balance*IntrestRate/100);
			System.out.println("Total Amount With Intrest:"+(balance+intrestAmount));
			
			double availableBalance= (double) (balance+intrestAmount-withDrawlAmount);	
			*/
			
			if (balance>withDrawlAmount) {
			
				double availableBalance= (double) (balance-withDrawlAmount);
				
				System.out.println("Debited Amount :" +withDrawlAmount);
				System.out.println("Transaction is Successfull \nRemaining Balance is :"+availableBalance);
				
		
			} else {
				System.out.println("Withdrawl amount exceeds the Available Balance Or Insufficient Balance");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
	}
	 
	void calculateInterest(){
		
		withDraw();
		
		/*int intrestAmount= (int) (balance*IntrestRate/100);
		System.out.println("Total Amount With Intrest:"+(balance+intrestAmount));
		*/
		
		
		
	}
	
	public static void main(String[] args) {
//		SavingsAccount obj=new SavingsAccount();
//		System.out.println(obj);
		SavingsAccount obj1=new SavingsAccount(10000.0, 2, 32054852003L);
		//System.out.println(obj1);
		obj1.calculateInterest();
	}
}
