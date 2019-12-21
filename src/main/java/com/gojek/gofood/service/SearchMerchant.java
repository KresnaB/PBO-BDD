package com.gojek.gofood.service;

import java.util.ArrayList;
import java.util.List;

import com.gojek.gofood.model.Merchant;
import java.util.regex.Pattern;

public class SearchMerchant {
	
	private List<Merchant> merchants;
	
	public SearchMerchant(List<Merchant> merchants) {
		this.merchants = merchants;
	}
	
	public List<Merchant> getSearchedMerchant(String merchant) {
		ArrayList<Merchant> result= new ArrayList<Merchant>() ;
		for (Merchant m : merchants) {
			if (Pattern.matches("." + merchant + ".", m.getName())) {
				result.add(m);
			}
		}
		return result;
	}
}
