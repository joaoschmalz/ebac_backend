package com.exercises.modules.m17_generics.second.dao.generic;

import com.exercises.modules.m17_generics.second.domain.Car;

public interface IGenericDAO<T extends Car> {

  Boolean save(final T entity);
}
