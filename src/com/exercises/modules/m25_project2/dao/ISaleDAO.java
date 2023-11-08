package com.exercises.modules.m25_project2.dao;

import com.exercises.modules.m25_project2.dao.generic.IGenericDAO;
import com.exercises.modules.m25_project2.domain.Sale;
import com.exercises.modules.m25_project2.exceptions.KeyTypeNotFoundException;

public interface ISaleDAO extends IGenericDAO<Sale, String> {

  void finishSale(Sale sale) throws KeyTypeNotFoundException;
}
