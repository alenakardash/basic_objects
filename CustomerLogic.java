package com.company.training.object.customer.logic;

import com.company.training.object.customer.bean.Customer;

import java.util.ArrayList;

public class CustomerLogic {
	
	public ArrayList<Customer> sortedByLastNameAsc(ArrayList<Customer> list) {
		
		for(int i = list.size() - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				
				Customer currentCustomer = list.get(j);
			String current = currentCustomer.getLastName();
			String next = list.get(j + 1).getLastName();
			
			if(current.compareTo(next) > 1) {
				list.remove(j);
				list.add(j + 1, currentCustomer);
			}
				
				
			}
		}
		return list;
	}
	
	public ArrayList<Customer> cardNumberInRange(ArrayList<Customer> cust, int min, int max) {
		ArrayList<Customer> customer = new ArrayList<Customer>();
		
		for(Customer cus : cust) {
			if (cus.getCardNumber() >= min && cus.getCardNumber() <= max) {
				customer.add(cus);
			}
		}
		return customer;
	}

}
