package com.exercises.modules.fourteen.services;

import com.exercises.modules.fourteen.dtos.CustomerDTO;
import com.exercises.modules.fourteen.infra.localDatabase.entities.Customer;
import com.exercises.modules.fourteen.infra.localDatabase.repositories.CustomerRepository;
import com.exercises.modules.fourteen.mapper.CustomerMapper;
import com.exercises.modules.fourteen.repositories.ICustomerRepository;

import static com.exercises.modules.fourteen.utils.Utils.isNullOrEmpty;
import static java.util.Objects.nonNull;

public class CreateCustomerService implements ICreateCustomerService {

  private final ICustomerRepository repository = new CustomerRepository();

  @Override
  public void execute(CustomerDTO customerDTO) throws Exception {
    this.checkers(customerDTO);
    repository.create(CustomerMapper.mapper(customerDTO));
  }

  private void checkers(final CustomerDTO customerDTO) throws Exception {
    this.doesExist(customerDTO.getCpf());
    this.checkRequireds(customerDTO);
  }

  private void doesExist(final String cpf) throws Exception {
    final Customer customer = this.repository.retrieveSingle(cpf);

    if (nonNull(customer)) throw new Exception("Already exists customer for the informed CPF");
  }

  private void checkRequireds(final CustomerDTO customerDTO) throws Exception {
    if(isNullOrEmpty(customerDTO.getName())) throw new Exception("Customer name can't be null or empty");
    if(isNullOrEmpty(customerDTO.getCpf())) throw new Exception("Customer CPF can't be null or empty");
  }


}
