package com.mytest.java;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class LandProperties {
	
	void priceAscendingOrder(){
		List<LandInfo> list= new ArrayList<LandInfo>();
		LandInfo obj= new LandInfo("Independent", 6000, "100", "Hyderabad");
		LandInfo obj1= new LandInfo("Independent", 4000, "150", "Secunderabad");
		LandInfo obj2= new LandInfo("Independent", 5000, "120", "Cyberabad");
		list.add(obj);
		list.add(obj1);
		list.add(obj2);
		Comparator<LandInfo> ob= new Comparator<LandInfo>(){

			@Override
			public int compare(LandInfo arg0, LandInfo arg1) {
				// TODO Auto-generated method stub
				if (arg0.getPropertyPrice()>arg1.getPropertyPrice()) 
					return 1;
				else
					return -1;}
			
		};
		
		Collections.sort(list,ob);
		for (LandInfo landInfo : list) {
			System.out.println(landInfo);
		}
	}
		
		void priceDescendingOrder(){
			List<LandInfo> list= new ArrayList<LandInfo>();
			LandInfo obj= new LandInfo("Independent", 6000, "100", "Hyderabad");
			LandInfo obj1= new LandInfo("Independent", 4000, "150", "Secunderabad");
			LandInfo obj2= new LandInfo("Independent", 5000, "120", "Cyberabad");
			list.add(obj);
			list.add(obj1);
			list.add(obj2);
			Comparator<LandInfo> ob= new Comparator<LandInfo>(){

				@Override
				public int compare(LandInfo arg0, LandInfo arg1) {
					// TODO Auto-generated method stub
					if (arg0.getPropertyPrice()<arg1.getPropertyPrice()) 
						return 1;
					else
						return -1;}
				
			};
			Collections.sort(list,ob);
			for (LandInfo landInfo : list) {
				System.out.println(landInfo);
			}
	}
	public static void main(String[] args) {
		 LandProperties obj= new LandProperties();
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Give Input");
		 String input=sc.next();
		// LandInfo ob=new LandInfo(input, 0, input, input);  
		if (input.equalsIgnoreCase("lowprice")) {
			obj.priceAscendingOrder();
		}
		if (input.equalsIgnoreCase("highprice")) {
			obj.priceDescendingOrder();
	}
}
	}
