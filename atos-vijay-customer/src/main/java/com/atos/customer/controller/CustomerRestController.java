package com.atos.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atos.customer.dao.CustomerDAO;
import com.atos.customer.model.Customer;

@RestController
public class CustomerRestController {

	@Autowired
	private CustomerDAO customerDAO;

	
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		return customerDAO.list();
	}

	@PostMapping(value = "/customers")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
		customerDAO.create(customer);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	 @DeleteMapping("/customers/{id}")
	 public ResponseEntity<Integer>	 deleteCustomer(@PathVariable Integer id) {
	 
	 if (null == customerDAO.delete(id)) { 
		 return new ResponseEntity<Integer>(HttpStatus.NOT_FOUND); }
	 
	 return new ResponseEntity<Integer>(id, HttpStatus.OK);
	 
	 }
}