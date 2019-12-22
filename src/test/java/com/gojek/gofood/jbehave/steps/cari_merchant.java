package com.gojek.gofood.jbehave.steps;

import com.gojek.gofood.model.*;

import org.jbehave.core.annotations.*;
//import static org.fest.assertions.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class cari_merchant {
	List<Merchant> merchants;
	//List<Merchant> SM;
	//List<String> prMerchants; 
	//showMerchant ShowMerchant;
	
	@Given("a list of merchants : $givenMerchants")
	public void givenListOfMerchants(List<String> givenMerchants) {
		merchants = new ArrayList<Merchant>();
		for (String e : givenMerchants) {
			merchants.add(new Merchant(e));
		}
	}
	
	@When("the distances between the merchants and the customer location are : $distance")
	public void whenDistanceBetweenMerchantsAndCustomer (List<Float> distance) {
		int i = 0;
		for(Merchant e : merchants){
			e.setDistance(distance.get(i));
			i++;
		}
	}
	
	@Then("the system should show the list of merchants : $listMerchant")
	public void shouldShowTheseMerchant(List<String> listMerchant) {
		Collections.sort(merchants);		
	}
}
