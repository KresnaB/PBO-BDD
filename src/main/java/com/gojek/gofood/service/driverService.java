package com.gojek.gofood.service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.gojek.gofood.model.*;

public class driverService {
	private List<Driver> driversList;
	
	public driverService(List<Driver> pl) {
		driversList = pl;
	}
	
	public List<String> getNearestDriverName() {
		ArrayList<String> result= new ArrayList<String>() ;
		float temp = 50;
		String temp2 ="";
		for (Driver e : driversList) {
			if (e.getDistance()<temp) {
				temp = e.getDistance();
				temp2 = e.getName();
			}
		}
		result.add(temp2);
		return result;
	}
	public List<String> getTopRatedName() {
		ArrayList<String> result= new ArrayList<String>() ;
		float temp = 0;
		String temp2 ="";
		for (Driver e : driversList) {
			if (e.getRating()>temp) {
				temp = e.getRating();
				temp2 = e.getName();
			}
		}
		result.add(temp2);
		return result;
	}

	public List<String> getTopName() {
		ArrayList<String> result= new ArrayList<String>() ;
		float temp = 50;
		String temp2 ="";
		for (Driver e : driversList) {
			if (e.getRatingDist()<temp) {
				temp = e.getRatingDist();
				temp2 = e.getName();
			}
		}
		result.add(temp2);
		return result;
	}
}
