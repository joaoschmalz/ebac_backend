package com.exercises.modules.fourteen.services;

import com.exercises.modules.fourteen.infra.localDatabase.entities.Customer;
import com.exercises.modules.fourteen.infra.localDatabase.repositories.CustomerRepository;
import com.exercises.modules.fourteen.repositories.ICustomerRepository;

import static java.util.Objects.isNull;

public class DeleteCustomerService implements IDeleteCustomerService {

  private final ICustomerRepository repository = new CustomerRepository();

  @Override
  public void execute(final String cpf) {
    final Customer customer = this.repository.retrieveSingle(cpf);
    if (isNull(customer)) return;

    this.repository.delete(cpf);
  }
}
