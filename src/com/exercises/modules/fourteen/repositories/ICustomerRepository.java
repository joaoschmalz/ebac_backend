package com.exercises.modules.fourteen.repositories;

import com.exercises.modules.fourteen.infra.localDatabase.entities.Customer;

import java.util.List;

public interface ICustomerRepository {

  void create(final Customer customer);
  Customer retrieveSingle(final String cpf);
  List<Customer> retrieveAll();
  void delete(final String cpf);
  void update(final Customer customer);
}
