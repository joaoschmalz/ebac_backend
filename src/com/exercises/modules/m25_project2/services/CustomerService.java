package com.exercises.modules.m25_project2.services;

import com.exercises.modules.m25_project2.dao.ICustomerDAO;
import com.exercises.modules.m25_project2.domain.Customer;
import com.exercises.modules.m25_project2.services.generic.GenericService;

public class CustomerService extends GenericService<Customer, Long> implements ICustomerService {

  public CustomerService(ICustomerDAO customerDAO) {
    super(customerDAO);
  }

  @Override
  public Customer retrieveBy(Long cpf) {
    return this.dao.retrieve(cpf);
  }
}
