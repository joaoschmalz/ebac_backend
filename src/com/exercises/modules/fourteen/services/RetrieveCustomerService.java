package com.exercises.modules.fourteen.services;

import com.exercises.modules.fourteen.infra.localDatabase.entities.Customer;
import com.exercises.modules.fourteen.infra.localDatabase.repositories.CustomerRepository;
import com.exercises.modules.fourteen.repositories.ICustomerRepository;

import java.util.List;

public class RetrieveCustomerService implements IRetrieveCustomerService {

  private final ICustomerRepository repository = new CustomerRepository();

  @Override
  public List<Customer> execute() {
    return this.repository.retrieveAll();
  }
}
