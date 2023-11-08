package com.exercises.modules.m25_project2.services;

import com.exercises.modules.m25_project2.dao.generic.IGenericDAO;
import com.exercises.modules.m25_project2.domain.Product;
import com.exercises.modules.m25_project2.services.generic.GenericService;

public class ProductService extends GenericService<Product, String> implements IProductService {

  public ProductService(IGenericDAO<Product, String> dao) {
    super(dao);
  }
}
