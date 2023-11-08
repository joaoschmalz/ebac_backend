package com.exercises.modules.m25_project2;

import com.exercises.modules.m25_project2.dao.CustomerDAO;
import com.exercises.modules.m25_project2.dao.ICustomerDAO;
import com.exercises.modules.m25_project2.domain.Customer;
import com.exercises.modules.m25_project2.exceptions.KeyTypeNotFoundException;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static java.util.Objects.nonNull;
import static org.junit.Assert.*;

public class CustomerDAOTest {

  private final ICustomerDAO customerDAO;
  private Customer customer;

  public CustomerDAOTest() {
    this.customerDAO = new CustomerDAO();
  }

  @Before
  public void init() {
    this.customer = new Customer();
    this.customer.setCpf(342391L);
    this.customer.setName("Xablau");
    this.customer.setEmail("xablau@email.com");
  }

  @Test
  public void ensureCanRetrieveCustomerByCPF() {
    Customer retrieved = this.customerDAO.retrieve(this.customer.getCpf());
    assertNotNull(retrieved);
  }

  @Test
  public void ensureCustomerCanBeSaved() throws KeyTypeNotFoundException {
    this.customer.setCpf(12345L);
    boolean result = this.customerDAO.save(this.customer);
    assertTrue(result);
  }

  @Test
  public void ensureCustomerCanBeDeleted() {
    this.customerDAO.delete(this.customer.getCpf());
  }

  @Test
  public void ensureCustomerCanBeUpdated() throws KeyTypeNotFoundException {
    this.customer.setName("Tester");
    this.customerDAO.update(this.customer);
    assertEquals("Tester", this.customer.getName());
  }

  @Test
  public void ensureCanRetrieveAllCustomers() {
    Collection<Customer> customers = this.customerDAO.retrieveAll();
    assertTrue(nonNull(customers));
    assertFalse(customers.isEmpty());
  }
}
