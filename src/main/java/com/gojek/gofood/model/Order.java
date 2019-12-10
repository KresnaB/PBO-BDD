package com.gojek.gofood.model;

public class Order {
	private String info;
	private String Status;
	private boolean stat;
	private String temp = "true";
	public Order(String info) {
		this.info = info;
	}
	public void setStatus(String stat) {this.Status=stat;}
	public void setStat(String stt) {
		if (stt.equals(temp)) {
			this.stat=true;
		}else {
			this.stat=false;
		}
	}
	public boolean getStat() {
		return stat;
	}
	public String getStatus() {return Status;}
	public String getInfo() {return info;}
}
