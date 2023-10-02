package com.exercises.modules.fourteen.services;

import com.exercises.modules.fourteen.infra.localDatabase.entities.Customer;

public interface IRetrieveSingleCustomerService {

  Customer execute (final String cpf);
}
