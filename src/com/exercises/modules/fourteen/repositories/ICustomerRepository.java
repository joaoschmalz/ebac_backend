package com.exercises.modules.fourteen.repositories;

import com.exercises.modules.fourteen.infra.database.entities.Customer;

public interface ICustomerRepository {

  void create(final Customer customer);
}
