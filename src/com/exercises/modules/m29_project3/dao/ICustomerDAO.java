package com.exercises.modules.m29_project3.dao;

import com.exercises.modules.m29_project3.domain.Customer;

import java.util.List;

public interface ICustomerDAO {

  Integer save(final Customer customer) throws Exception;
  Integer update(final Customer customer) throws Exception;
  Customer retrieve(final String code) throws Exception;
  List<Customer> retrieveAll() throws Exception;
  Integer delete (final Customer customer) throws Exception;
}
