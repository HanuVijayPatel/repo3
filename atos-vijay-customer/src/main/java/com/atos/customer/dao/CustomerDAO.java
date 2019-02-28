package com.atos.customer.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.atos.customer.model.Customer;

@Repository
@Component
public class CustomerDAO {
	
	// prepared sample list of customer for testing... 
	private static List<Customer> customers;
	{
		customers = new ArrayList<Customer>();
		customers.add(new Customer(100, "Vijay", "Patel"));
		customers.add(new Customer(101, "John", "Mark"));
		customers.add(new Customer(102, "Rusulle", "Smith"));
		customers.add(new Customer(103,  "Katherin", "Williams"));
	}

	public List<Customer> list() {
		return customers;
	}

	
	public Customer get(Integer id) {

		for (Customer c : customers) {
			if (c.getId().equals(id)) {
				return c;
			}
		}
		return null;
	}

	
	public Customer create(Customer customer) {
		customers.add(customer);
		return customer;
	}

	public Integer delete(Integer id) {

		for (Customer c : customers) {
			if (c.getId().equals(id)) {
				customers.remove(c);
				return id;
			}
		}

		return null;
	}

	public Customer update(Integer id, Customer customer) {

		for (Customer c : customers) {
			if (c.getId().equals(id)) {
				customer.setId(c.getId());
				customers.remove(c);
				customers.add(customer);
				return customer;
			}
		}

		return null;
	}

}