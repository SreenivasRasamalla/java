package com.mytest.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.lang.NullPointerException;
import java.util.Scanner;

public class MovieRating {

	ArrayList<Movie> list=new ArrayList<Movie>();
	Scanner sc=new Scanner(System.in);
	
	ArrayList<Movie> movieDetails() {
		
	try {
		for (int i = 0; i < 2; i++) {
			
		System.out.println("Enter Movie Name");
		String movieName=sc.next();
						
		System.out.println("Enter rating");
		int rating=sc.nextInt();
		
		Movie obj=new Movie(movieName, rating);
		list.add(obj);
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.getMessage();
		
	}
	return list;
	
	}
		
	
	void ratingInfo(Scanner sc){
		try {
		ArrayList<Movie> obj= movieDetails();
		
			System.out.println("Enter movie name and get Rating");
			String str=sc.next();
			
			for (Movie movie : obj) {
				
				if (movie.getMovieName().equals(str)) {
					
					System.out.println(movie.getRating());
					break;
					}
				}
			
			
			System.out.println("No movie is available");
		}
		catch (Exception e) {
		//	System.out.println("No movie is available");
			// TODO: handle exception
			e.getMessage();
		
		}
		
	
	}
	public static void main(String[] args) {

		MovieRating obj=new MovieRating();
		Scanner sc=new Scanner(System.in);
		obj.ratingInfo(sc);
		
	}
}
