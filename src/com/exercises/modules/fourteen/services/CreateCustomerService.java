package com.exercises.modules.fourteen.services;

import com.exercises.modules.fourteen.dtos.CustomerDTO;
import com.exercises.modules.fourteen.infra.database.repositories.CustomerRepository;
import com.exercises.modules.fourteen.mapper.CustomerMapper;
import com.exercises.modules.fourteen.repositories.ICustomerRepository;

public class CreateCustomerService implements ICreateCustomerService {

  private final ICustomerRepository repository = new CustomerRepository();

  @Override
  public void execute(CustomerDTO customerDTO) {
    repository.create(CustomerMapper.mapper(customerDTO));
  }
}
