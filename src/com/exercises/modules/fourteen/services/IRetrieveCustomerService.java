package com.exercises.modules.fourteen.services;

import com.exercises.modules.fourteen.infra.localDatabase.entities.Customer;

import java.util.List;

public interface IRetrieveCustomerService {

  List<Customer> execute();
}
