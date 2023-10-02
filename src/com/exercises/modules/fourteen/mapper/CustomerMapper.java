package com.exercises.modules.fourteen.mapper;

import com.exercises.modules.fourteen.dtos.CustomerDTO;
import com.exercises.modules.fourteen.infra.database.entities.Customer;
import com.exercises.modules.fourteen.infra.http.views.CustomerView;

public class CustomerMapper {

  public static CustomerDTO mapper(final CustomerView view) {
    final CustomerDTO dto = new CustomerDTO();

    dto.setName(view.getName());
    dto.setCpf(view.getCpf());
    dto.setPhone(view.getPhone());
    dto.setAddress(view.getAddress());
    dto.setCity(view.getCity());
    dto.setState(view.getState());

    return dto;
  }

  public static Customer mapper(final CustomerDTO dto) {
    final Customer customer = new Customer();

    customer.setName(dto.getName());
    customer.setCpf(dto.getCpf());
    customer.setPhone(dto.getPhone());
    customer.setAddress(dto.getAddress());
    customer.setCity(dto.getCity());
    customer.setState(dto.getState());

    return customer;
  }
}
