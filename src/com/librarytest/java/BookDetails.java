package com.librarytest.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookDetails {
	
	ArrayList<Library> list=new ArrayList<Library>();
	ArrayList<Library> bookInfo(){
		Scanner sc=new Scanner(System.in);	
		try {
			for (int i = 0; i < 2; i++) {
				System.out.println("Enter author name");
				String authorName=sc.next();
				System.out.println("Enter rack Number");
				String rackNum=sc.next();
				System.out.println("Enter price");
				int price=sc.nextInt();
				System.out.println("Enter year of Publishing");
				int yearOfPublishing=sc.nextInt();
				
				//Library obj=new Library("Sree", "A1", 999, 1995);
				Library obj=new Library(authorName, rackNum, price, yearOfPublishing);
				list.add(obj);
				//System.out.println(obj);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return list;
		}
	
	void getBookInfo(Scanner sc){
		try {
			
		
		//bookInfo();
		ArrayList<Library> obj= bookInfo();
		System.out.println("Enter author name & get total info=");
		String authorName=sc.next();
		for (Library library1 : obj) {
			if (library1.getAuthorName().equalsIgnoreCase(authorName)) {
				System.out.println("author name="+library1.getAuthorName()+"Rack number="+library1.getRackNum()+"price="+library1.getPrice()+"year of publishing ="+library1.getYearOfPublishing());
				
			}
		
		}
		System.out.println("No book Avaialble, please try again!!");			
		/*for (Library library1 : list) {
			System.out.println("author name="+library1.getAuthorName()+"Rack number="+library1.getRackNum()+"price="+library1.getPrice()+"year of publishing ="+library1.getYearOfPublishing());
				
		}*/
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		BookDetails obj=new BookDetails();
		Scanner sc=new Scanner(System.in);
		obj.getBookInfo(sc);
	}
}
