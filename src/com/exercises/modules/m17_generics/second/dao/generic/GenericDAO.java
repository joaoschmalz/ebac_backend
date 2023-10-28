package com.exercises.modules.m17_generics.second.dao.generic;

import com.exercises.modules.m17_generics.second.Storage;
import com.exercises.modules.m17_generics.second.domain.Car;

import java.util.Map;

public abstract class GenericDAO<T extends Car> implements IGenericDAO<T>{

  private final Storage storage;

  public abstract Class<T> getClassType();

  public GenericDAO() {
    this.storage = Storage.getInstance();
  }

  @Override
  public Boolean save(final T entity) {
    final Map<Long, T> entityMap = this.getEntityMap();
    if(entityMap.containsKey(entity.getCode())) return false;

    entityMap.put(entity.getCode(), entity);
    return true;
  }

  private Map<Long, T> getEntityMap() {
    return (Map<Long, T>) this.storage.getMap().get(getClassType());
  }
}
