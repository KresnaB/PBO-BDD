package com.gojek.gofood.jbehave.steps;

import com.gojek.gofood.model.*;
import com.gojek.gofood.service.*;

import org.jbehave.core.annotations.*;
import static org.fest.assertions.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

public class pengiriman_gofood {
	List<Driver> drivers;
	List<String> proposedDrivers;
	driverService DriverService;
	List<Driver> drivers2;
	List<String> highestRating;
	driverService DriverService2;
	@Given("a list of drivers : $givenDrivers")
	public void givenListOfDrivers(List<String> givenDrivers) {
		drivers = new ArrayList<Driver>();
		for (String e : givenDrivers) {
			drivers.add(new Driver(e));
		}
	}
	
	@When("The distances between these drivers and the merchant location are : $distance")
	public void whenDistanceBetweenDriversAndMerchant (List<Float> distance) {
		int i = 0;
		for(Driver e : drivers){
			e.setDistance(distance.get(i));
			i++;
		}
		DriverService = new driverService(drivers);
		proposedDrivers = DriverService.getNearestDriverName();
	}
	
	@Then("The sistem should pick : $nearestDriver")
	public void shouldFindTheseDriver(List<String> nearestDriver) {
		assertThat(proposedDrivers).isEqualTo(nearestDriver);
	}
	
	@Given("drivers list : $givenlistDrivers")
	public void givenListOfRatedDrivers(List<String> givenlistDrivers) {
		drivers2 = new ArrayList<Driver>();
		for (String e : givenlistDrivers) {
			drivers2.add(new Driver(e));
		}
	}
	
	@When("The rating of each driver : $rating")
	public void whenRating (List<Float> rating) {
		int i = 0;
		for(Driver e : drivers2){
			e.setRating(rating.get(i));
			i++;
		}
		DriverService2 = new driverService(drivers2);
		highestRating = DriverService2.getTopRatedName();
	}
	
	@Then("The sistem should choose : $highestRating")
	public void shouldChoose(List<String> highestRating) {
		assertThat(highestRating).isEqualTo(highestRating);
	}
}
