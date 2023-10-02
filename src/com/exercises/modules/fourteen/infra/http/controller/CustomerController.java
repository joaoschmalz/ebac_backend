package com.exercises.modules.fourteen.infra.http.controller;

import com.exercises.modules.fourteen.infra.http.views.CustomerView;
import com.exercises.modules.fourteen.mapper.CustomerMapper;
import com.exercises.modules.fourteen.services.CreateCustomerService;
import com.exercises.modules.fourteen.services.ICreateCustomerService;

public class CustomerController {

  private final ICreateCustomerService createService = new CreateCustomerService();
  private final IUpdateClientService updateService = new UpdateClientService();
  private final IRetrieveClientService retrieveService = new RetrieveClientService();
  private final IRetrieveSingleClientService retrieveSingleService = new RetrieveSingleService();
  private final IDeleteClientService deleteService = new DeleteClientService();

  public boolean create(final CustomerView view) {
    try {
      createService.execute(CustomerMapper.mapper(view));
      return true;
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return false;
    }
  }
}