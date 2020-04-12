package com.company.training.object;

import java.util.ArrayList;

import com.company.training.object.customer.bean.Customer;
import com.company.training.object.customer.logic.CustomerLogic;
import com.company.training.object.customer.view.CustomerView;

public class CustomerDemo {

	public static void main(String[] args) {

		ArrayList<Customer> customers = new ArrayList<>();

		Customer cust1 = new Customer(1, "Петров", "Игорь", "Александрович", "Москва", 34);
		Customer cust2 = new Customer(2, "Иванов", "Андрей", "Петрович", "Минск", 3);
		Customer cust3 = new Customer(3, "Сидоров", "Алексей", "Иванович", "Нью-Йорк", 22);
		Customer cust4 = new Customer(4, "Барабанов", "Борис", "Дмитриевич", "Лондон", 45);

		customers.add(cust1);
		customers.add(cust2);
		customers.add(cust3);
		customers.add(cust4);

		CustomerLogic logic = new CustomerLogic();

		ArrayList<Customer> sortedByLastName = logic.sortedByLastNameAsc(customers);

		CustomerView view = new CustomerView();

		System.out.println("Клиенты, сортированные по фамилиям в алфавитном порядке");

		view.printCustomers(sortedByLastName);

		int minCreditNumber = 20;
		int maxCreditNumber = 35;

		ArrayList<Customer> customersWithCardsInRange = logic.cardNumberInRange(customers, minCreditNumber,
				maxCreditNumber);
		
		System.out.println("");

		System.out.println(
				"Клиенты с номерами кредитных кард в диапазоне " + " " + minCreditNumber + " - " + maxCreditNumber);

		view.printCustomers(customersWithCardsInRange);

	}
}
