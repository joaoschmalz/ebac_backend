package com.exercises.modules.fourteen.infra.localDatabase.repositories;

import com.exercises.modules.fourteen.infra.localDatabase.entities.Customer;
import com.exercises.modules.fourteen.repositories.ICustomerRepository;

import java.util.*;

public class CustomerRepository implements ICustomerRepository {

  private final Map<String, Customer> customers = new HashMap<>();

  @Override
  public void create(Customer customer) {
    this.customers.put(customer.getCpf(), customer);
  }

  @Override
  public Customer retrieveSingle(final String cpf) {
    return this.customers.get(cpf);
  }

  @Override
  public List<Customer> retrieveAll() {
    return new ArrayList<>(this.customers.values());
  }

  @Override
  public void delete(final String cpf) {
    this.customers.remove(cpf);
  }

  @Override
  public void update(final Customer customer) {
    this.customers.replace(customer.getCpf(), customer);
  }


}
