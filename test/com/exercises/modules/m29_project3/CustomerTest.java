package com.exercises.modules.m29_project3;

import com.exercises.modules.m29_project3.dao.CustomerDAO;
import com.exercises.modules.m29_project3.dao.ICustomerDAO;
import com.exercises.modules.m29_project3.domain.Customer;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

  private ICustomerDAO customerDAO;

  @Test
  public void saveTest() throws Exception {
    this.customerDAO = new CustomerDAO();

    Customer customer = new Customer();
    customer.setCode("10");
    customer.setName("Xablau");
    Integer count = this.customerDAO.save(customer);
    assertTrue(count == 1);

    Customer customerDB = this.customerDAO.retrieve("10");
    assertNotNull(customer.getCode(), customerDB.getCode());
    assertEquals(customer.getCode(), customerDB.getCode());
    assertEquals(customer.getName(), customerDB.getName());
  }
}
