package com.gojek.gofood.model;

public class Merchant {
	private String name;
	
	/*
	 * true = Personal
	 * false = Company
	 */
	private boolean businessForm;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBusinessForm(boolean businessForm) {
		this.businessForm = businessForm;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean getBusinessForm() {
		return businessForm;
	}
}