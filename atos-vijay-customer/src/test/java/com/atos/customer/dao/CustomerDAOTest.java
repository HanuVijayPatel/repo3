package com.atos.customer.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.atos.customer.model.Customer;


public class CustomerDAOTest {

	CustomerDAO dao;
	@Before
	public void setUp() throws Exception {
		dao = new CustomerDAO();
	}

	@Test
	public void testList() {
		assertEquals(4, dao.list().size());
	}

	@Test
	public void testCreate() {
		Customer test = new Customer(900, "Test" , "Case");
		assertNotNull(dao.create(test));
		assertEquals(5, dao.list().size());
		
	}

	@Test
	public void testDelete() {
		Customer test = new Customer(900, "Test" , "Case");
		assertNotNull(dao.create(test));
		assertNotNull(dao.delete(900));
		assertEquals(4, dao.list().size());
	}

}
