package com.gojek.gofood.service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.gojek.gofood.model.*;

public class SaveOrder {
	private List<Order> orderInfo;
	
	public SaveOrder(List<Order> pl) {
		orderInfo = pl;
	}
	public List<String> getSavedOrder() {
		ArrayList<String> result= new ArrayList<String>() ;
		String temp2 ="Complete";
		for (Order e : orderInfo) {
			if (e.getStatus().equals(temp2)) {
				result.add(e.getInfo()+" "+e.getLocation()+" "+e.getMenu());
			}
		}
		
		return result;
	}
}
