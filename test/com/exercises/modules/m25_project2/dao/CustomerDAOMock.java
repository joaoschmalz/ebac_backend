package com.exercises.modules.m25_project2.dao;

import com.exercises.modules.m25_project2.domain.Customer;
import com.exercises.modules.m25_project2.exceptions.KeyTypeNotFoundException;

import java.util.Collection;

public class CustomerDAOMock implements ICustomerDAO {
  @Override
  public boolean save(Customer entity) throws KeyTypeNotFoundException {
    return true;
  }

  @Override
  public void delete(Long value) {

  }

  @Override
  public void update(Customer entity) throws KeyTypeNotFoundException {

  }

  @Override
  public Customer retrieve(Long value) {
    Customer customer = new Customer();
    customer.setCpf(value);
    return customer;
  }

  @Override
  public Collection<Customer> retrieveAll() {
    return null;
  }
}
