package com.exercises.modules.m17_generics.second.dao;

import com.exercises.modules.m17_generics.second.Storage;
import com.exercises.modules.m17_generics.second.dao.generic.GenericDAO;
import com.exercises.modules.m17_generics.second.domain.Peugeout;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.isNull;

public class PeugeoutDAO extends GenericDAO<Peugeout> implements IPeugeoutDAO {

  public PeugeoutDAO() {
    super();
    Map<Long, Peugeout> entityMap = (Map<Long, Peugeout>) Storage.getInstance().getMap().get(Peugeout.class);
    if (isNull(entityMap)) {
      entityMap = new HashMap<>();
      Storage.getInstance().getMap(). put(Peugeout.class, entityMap);
    }
  }

  @Override
  public Class<Peugeout> getClassType() {
    return Peugeout.class;
  }
}
