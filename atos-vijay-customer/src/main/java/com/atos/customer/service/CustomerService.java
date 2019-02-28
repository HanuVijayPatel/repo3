package com.atos.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atos.customer.dao.CustomerDAO;

@Service
public class CustomerService {

	@Autowired
	public CustomerDAO customerDao;
	
	
	public CustomerService() {
	}
}
