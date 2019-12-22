package com.gojek.gofood.model;

public class Merchant implements Comparable<Merchant>{
	private String Name;
	private double Distance;
	
	public Merchant(String Name) {
		this.Name = Name;
		Distance = 0;
	}
		
	public String getName() {return Name;}
	public void setName(String newName) { Name = newName; }
	public double getDistance() { return Distance;}
	public void setDistance(double newDistance) { Distance = newDistance; }
	
	public int compareTo(Merchant m) {
        if (this.Distance < m.Distance) {
            return -1;
        } else if (this.Distance == m.Distance) {
            return 0;
        } else {
            return 1;
        }
    }
}