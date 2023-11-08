package com.exercises.modules.m25_project2.services;

import com.exercises.modules.m25_project2.domain.Customer;
import com.exercises.modules.m25_project2.exceptions.KeyTypeNotFoundException;

public interface ICustomerService {

  boolean save(Customer customer) throws KeyTypeNotFoundException;

  Customer retrieveBy(Long cpf);

  void delete(Long cpf);

  void update(Customer customer) throws KeyTypeNotFoundException;
}
