package com.company.training.object.customer.view;

import com.company.training.object.customer.bean.Customer;

import java.util.ArrayList;

public class CustomerView {
	
	public void printCustomers(ArrayList<Customer> cust) {
		
		for(Customer customer : cust) {
			System.out.println(customer.toString());
		}
		
	}

}
