package com.gojek.gofood.service;

import java.util.ArrayList;
import java.util.List;

import com.gojek.gofood.model.Products;

public class SearchProduct {
	
	private List<Products> productList;
	
	public SearchProduct(List<Products> pl) {
		productList = pl;
	}
	
	public List<String> getNearestProduct() {
		ArrayList<String> result= new ArrayList<String>() ;
		float temp = 50;
		String temp2 ="";
		for (Products e : productList) {
			if (e.getDistance()<temp) {
				temp = e.getDistance();
				temp2 = e.getName();
			}
		}
		result.add(temp2);
		return result;
	}
}
