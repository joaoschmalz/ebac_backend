package com.exercises.modules.fourteen.services;

import com.exercises.modules.fourteen.dtos.CustomerDTO;

public interface ICreateCustomerService {

  void execute(final CustomerDTO customerDTO);
}
