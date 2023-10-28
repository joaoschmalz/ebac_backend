package com.exercises.modules.m17_generics.second.dao;

import com.exercises.modules.m17_generics.second.Storage;
import com.exercises.modules.m17_generics.second.dao.generic.GenericDAO;
import com.exercises.modules.m17_generics.second.domain.Honda;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.isNull;

public class HondaDAO extends GenericDAO<Honda> implements IHondaDAO {

  public HondaDAO() {
    super();
    Map<Long, Honda> entityMap = (Map<Long, Honda>) Storage.getInstance().getMap().get(Honda.class);
    if (isNull(entityMap)) {
      entityMap = new HashMap<>();
      Storage.getInstance().getMap().put(Honda.class, entityMap);
    }
  }

  @Override
  public Class<Honda> getClassType() {
    return Honda.class;
  }
}
