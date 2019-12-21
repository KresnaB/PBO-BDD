package com.gojek.gofood.jbehave.steps;

import com.gojek.gofood.model.*;
import com.gojek.gofood.service.*;

import org.jbehave.core.annotations.*;
import static org.fest.assertions.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

public class Search_products {
	List<Products> products;
	List<String> proposedProducts;
	SearchProduct searchProduct;
	
	@Given("a list of products: givenProducts")
	public void givenListOfProducts(List<String> givenProducts) {
		products = new ArrayList<Products>();
		for (String e : givenProducts) {
			products.add(new Products(e));
		}
	}
	
	@When("The distances between the merchants and my location are: $distance")
	public void whenDistanceBetweenMerchantAndMe (List<Float> distance) {
		int i = 0;
		for(Products e : products){
			e.setDistance(distance.get(i));
			i++;
		}
		searchProduct = new SearchProduct(products);
		proposedProducts = searchProduct.getNearestProduct();
	}
	
	@Then("The sistem should pick : $nearestProducts")
	public void shouldFindTheseProducts(List<String> nearestProducts) {
		assertThat(proposedProducts).isEqualTo(nearestProducts);
	}
	
	@Given("a list of products : $givenProducts")
	public void givenListOfProducts(List<String> givenProducts) {
		products = new ArrayList<Products>();
		for(String e : givenProducts) {
			products.add(new Products(e));
		}		
	}
	@When("I search product : $productSearch")
	public void searchProduct(String productName) {
		searchProduct = new SearchProduct(products);
		proposedProducts = searchProduct.getSearchedProducts(productName);
	}
	@Then("the system should display product : $productNotFound not found")
	public void shouldDisplay(String productNotFound) {
		if (proposedProducts == null) {
			assertThat(productNotFound).isEqualTo("Product not found");
		}
	}
	
}
