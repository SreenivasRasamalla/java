package com.mytest.java;

import java.util.ArrayList;

public class LandInfo implements Comparable<LandInfo> {
	
	private String typeOfProperty;
	private int propertyPrice;
	private String areaOfProperty;
	private String location;
	private LandInfo price;
		
	
	
	@Override
	public String toString() {
		return "LandInfo [typeOfProperty=" + typeOfProperty + ", propertyPrice=" + propertyPrice + ", areaOfProperty="
				+ areaOfProperty + ", location=" + location + "]";
	}


	public LandInfo(String typeOfProperty, int propertyPrice, String areaOfProperty, String location) {
		super();
		this.typeOfProperty = typeOfProperty;
		this.propertyPrice = propertyPrice;
		this.areaOfProperty = areaOfProperty;
		this.location = location;
	}
	
	
	public String getTypeOfProperty() {
		return typeOfProperty;
	}


	public void setTypeOfProperty(String typeOfProperty) {
		this.typeOfProperty = typeOfProperty;
	}


	public int getPropertyPrice() {
		return propertyPrice;
	}


	public void setPropertyPrice(int propertyPrice) {
		this.propertyPrice = propertyPrice;
	}


	public String getAreaOfProperty() {
		return areaOfProperty;
	}


	public void setAreaOfProperty(String areaOfProperty) {
		this.areaOfProperty = areaOfProperty;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public int compareTo(LandInfo arg0) {
		// TODO Auto-generated method stub
		
		if(this.getPropertyPrice()>price.getPropertyPrice())
		return 1;
		else
			return -1;
	}
	

	

}
