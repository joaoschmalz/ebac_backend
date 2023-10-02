package com.exercises.modules.fourteen.services;

import com.exercises.modules.fourteen.infra.localDatabase.entities.Customer;
import com.exercises.modules.fourteen.infra.localDatabase.repositories.CustomerRepository;
import com.exercises.modules.fourteen.repositories.ICustomerRepository;

public class RetrieveSingleCustomerService implements IRetrieveSingleCustomerService {

  private final ICustomerRepository repository = new CustomerRepository();

  @Override
  public Customer execute(final String cpf) {
    return this.repository.retrieveSingle(cpf);
  }
}
