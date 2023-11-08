package com.exercises.modules.m25_project2.dao;

import com.exercises.modules.m25_project2.dao.generic.GenericDAO;
import com.exercises.modules.m25_project2.domain.Product;

public class ProductDAO extends GenericDAO<Product, String> implements IProductDAO {
  @Override
  public Class<Product> getClassType() {
    return Product.class;
  }

  @Override
  public void updateData(Product newEntity, Product entity) {
    entity.setCode(newEntity.getCode());
    entity.setName(newEntity.getName());
    entity.setDescription(newEntity.getDescription());
    entity.setPrice(newEntity.getPrice());
  }
}
