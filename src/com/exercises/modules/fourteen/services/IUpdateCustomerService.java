package com.exercises.modules.fourteen.services;

import com.exercises.modules.fourteen.dtos.CustomerDTO;

public interface IUpdateCustomerService {
  void execute(final CustomerDTO dto);
}
