package com.exercises.modules.fourteen.services;

import com.exercises.modules.fourteen.dtos.CustomerDTO;
import com.exercises.modules.fourteen.infra.localDatabase.entities.Customer;
import com.exercises.modules.fourteen.infra.localDatabase.repositories.CustomerRepository;
import com.exercises.modules.fourteen.mapper.CustomerMapper;
import com.exercises.modules.fourteen.repositories.ICustomerRepository;

import static java.util.Objects.isNull;

public class UpdateCustomerService implements IUpdateCustomerService {

  private final ICustomerRepository repository = new CustomerRepository();

  @Override
  public void execute(final CustomerDTO dto) throws Exception {
    final Customer customer = this.repository.retrieveSingle(dto.getCpf());

    if (isNull(customer)) throw new Exception("Customer not found for given CPF");

    this.repository.update(CustomerMapper.mapper(dto));
  }
}
