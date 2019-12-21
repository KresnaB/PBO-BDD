package com.gojek.gofood.jbehave.steps;

import com.gojek.gofood.model.*;
import com.gojek.gofood.service.*;

import org.jbehave.core.annotations.*;
import static org.fest.assertions.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

public class SearchMerchantStep {
	List<Merchant> merchants;
	List<Merchant> proposedMerchants;
	SearchMerchant searchMerchant;
	
	@Given("a list of merchants: givenMerchants")
	public void givenListOfMerchants(List<String> givenMerchants) {
		merchants = new ArrayList<Merchant>();
		for (String e : givenMerchants) {
			merchants.add(new Merchant(e));
		}
	}
	
	@When("I search merchant: $merchant")
	public void whenISearchMerchant (String merchant) {
		searchMerchant = new SearchMerchant(merchants);
		proposedMerchants = searchMerchant.getSearchedMerchant(merchant);
	}
	
	@Then("the system should display : $message")
	public void shouldDisplay(String message) {
		if (proposedMerchants == null) {
			assertThat(message).isEqualTo("no sign of merchant");
		}
	}
	
}
