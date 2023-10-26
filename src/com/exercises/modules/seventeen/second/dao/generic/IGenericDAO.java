package com.exercises.modules.seventeen.second.dao.generic;

import com.exercises.modules.seventeen.second.domain.Car;

public interface IGenericDAO<T extends Car> {

  Boolean save(final T entity);
}
