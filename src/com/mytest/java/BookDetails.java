package com.mytest.java;

public class BookDetails {

	private  String authorName;
	private  String RackNumber;
	private  double price;
	private  int yearOfPublishing;
	
	public BookDetails(String authorName, String rackNumber, double price, int yearOfPublishing) {
		
		this.authorName = authorName;
		RackNumber = rackNumber;
		this.price = price;
		this.yearOfPublishing = yearOfPublishing;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getRackNumber() {
		return RackNumber;
	}
	public void setRackNumber(String rackNumber) {
		RackNumber = rackNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYearOfPublishing() {
		return yearOfPublishing;
	}
	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}
	
	
	@Override
	public String toString() {
		return "BookDetails [authorName=" + authorName + ", RackNumber=" + RackNumber + ", price=" + price
				+ ", yearOfPublishing=" + yearOfPublishing + "]";
	}
	
	
	
			
}
