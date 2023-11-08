package com.exercises.modules.m25_project2.services.generic;

import com.exercises.modules.m25_project2.dao.Persistable;
import com.exercises.modules.m25_project2.exceptions.KeyTypeNotFoundException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericService <T extends Persistable, E extends Serializable> {

  boolean save(T entity) throws KeyTypeNotFoundException;
  void delete(E value);
  void update(T entity) throws KeyTypeNotFoundException;
  T retrieve(E value);
  Collection<T> retrieveAll();
}
