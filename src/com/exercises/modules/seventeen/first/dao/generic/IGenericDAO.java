package com.exercises.modules.seventeen.first.dao.generic;

import com.exercises.modules.seventeen.first.domain.Persistable;

import java.util.Collection;

public interface IGenericDAO <T extends Persistable> {

  Boolean save(final T entity);
  void delete(final String code);
  void update(final T entity);
  T retrieve(final Long code);
  Collection<T> retrieveAll();
}
