package com.gojek.gofood.jbehave.steps;

import com.gojek.gofood.model.*;
import com.gojek.gofood.service.*;

import org.jbehave.core.annotations.*;
import static org.fest.assertions.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;


public class Order_History {
	List<Order> orderInformation;
	List<Order> orderHist;
	List<String> proposedOrders;
	List<String> proposedOrdersHistory;
	SaveOrder savedOrder;
	SaveOrder ordersHistory;
	
	@Given("List of orders : $givenOrder")
	public void givenOrderGoFood(List<String> givenOrder) {
		orderInformation = new ArrayList<Order>();
		for (String e : givenOrder) {
			orderInformation.add(new Order(e));
		}
	}
	
	@When("Order are : $status")
	public void whenOrderAre (List<String> status) {
		int i=0;
		for(Order e : orderInformation){
			e.setStatus(status.get(i));
			i++;
		}
		savedOrder = new SaveOrder(orderInformation);
		proposedOrders = savedOrder.getSavedOrder();
	}
	@Then("Save information : $saveShould")
	public void shouldFindTheseOrder(List<String> saveShould) {
		assertThat(proposedOrders).isEqualTo(saveShould);
	}
	
	@Given("A List of orders history : $orderHistory")
	public void givenHistoryOfOrder(List<String> orderHistory) {
		orderHist = new ArrayList<Order>();
		for (String e : orderHistory) {
			orderHist.add(new Order(e));
		}
	}
	@When("I selected an order : $stat")
	public void SelectOrderHistory (List<String> stat) {
		int i=0;
		for(Order e : orderHist){
			e.setStat(stat.get(i));
			i++;
		}
		ordersHistory = new SaveOrder(orderHist);
		proposedOrdersHistory = ordersHistory.getOrderHistory();
	}
	@Then("Display selected order : $orderHistory")
	public void shouldFindTheseOrderHistory(List<String> orderHistory) {
		assertThat(proposedOrdersHistory).isEqualTo(orderHistory);
	}
}
