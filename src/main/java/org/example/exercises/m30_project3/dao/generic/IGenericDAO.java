package org.example.exercises.m30_project3.dao.generic;

import org.example.exercises.m30_project3.dao.Persistent;
import org.example.exercises.m30_project3.exceptions.DAOException;
import org.example.exercises.m30_project3.exceptions.DuplicatedEntryException;
import org.example.exercises.m30_project3.exceptions.KeyNotFoundException;
import org.example.exercises.m30_project3.exceptions.TableException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericDAO <T extends Persistent, E extends Serializable> {

  Boolean save(T entity) throws KeyNotFoundException, DAOException;
  void delete(E value) throws DAOException;
  void update(T entity) throws KeyNotFoundException, DAOException;
  T retrieve(E value) throws DuplicatedEntryException, TableException, DAOException;
  Collection<T> retrieveAll() throws DAOException;
}
