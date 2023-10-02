package com.exercises.modules.fourteen.infra.http.controller;

import com.exercises.modules.fourteen.infra.localDatabase.entities.Customer;
import com.exercises.modules.fourteen.infra.http.views.CustomerView;
import com.exercises.modules.fourteen.mapper.CustomerMapper;
import com.exercises.modules.fourteen.services.*;

import java.util.List;

import static java.util.Objects.isNull;

public class CustomerController {

  private final ICreateCustomerService createService = new CreateCustomerService();
  private final IUpdateCustomerService updateService = new UpdateCustomerService();
  private final IRetrieveCustomerService retrieveService = new RetrieveCustomerService();
  private final IRetrieveSingleCustomerService retrieveSingleService = new RetrieveSingleCustomerService();
  private final IDeleteCustomerService deleteService = new DeleteCustomerService();

  public boolean create(final CustomerView view) {
    try {
      createService.execute(CustomerMapper.mapper(view));
      return true;
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return false;
    }
  }

  public Customer index(final String cpf) throws Exception {
    final Customer customer = this.retrieveSingleService.execute(cpf);
    if (isNull(customer)) throw new Exception("Customer not found");

    return customer;
  }

  public List<Customer> show() {
    return this.retrieveService.execute();
  }

  public void delete(final String cpf) {
    this.deleteService.execute(cpf);
  }

  public void update(final CustomerView view) {
    this.updateService.execute(CustomerMapper.mapper(view));
  }
}