package com.exercises.modules.fourteen.services;

import com.exercises.modules.fourteen.dtos.CustomerDTO;
import com.exercises.modules.fourteen.infra.localDatabase.repositories.CustomerRepository;
import com.exercises.modules.fourteen.mapper.CustomerMapper;
import com.exercises.modules.fourteen.repositories.ICustomerRepository;

public class UpdateCustomerService implements IUpdateCustomerService {

  private final ICustomerRepository repository = new CustomerRepository();

  @Override
  public void execute(final CustomerDTO dto) {
    this.repository.update(CustomerMapper.mapper(dto));
  }
}
