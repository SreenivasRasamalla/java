package com.librarytest.java;

public class Library {
	
	private String authorName;
	private String rackNum;
	private double price;
	private int yearOfPublishing;
	
	
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getRackNum() {
		return rackNum;
	}
	public void setRackNum(String rackNum) {
		this.rackNum = rackNum;
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
		return "Library [authorName=" + authorName + ", rackNum=" + rackNum + ", price=" + price + ", yearOfPublishing="
				+ yearOfPublishing + "]";
	}
	
	public Library(String authorName, String rackNum, double price, int yearOfPublishing) {
		super();
		this.authorName = authorName;
		this.rackNum = rackNum;
		this.price = price;
		this.yearOfPublishing = yearOfPublishing;
	}
	
	

}
