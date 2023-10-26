package com.exercises.modules.seventeen.first.dao;

import com.exercises.modules.seventeen.first.Storage;
import com.exercises.modules.seventeen.first.dao.generic.GenericDAO;
import com.exercises.modules.seventeen.first.domain.Bus;
import com.exercises.modules.seventeen.first.domain.Motorcicle;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.isNull;

public class MotorcicleDAO extends GenericDAO<Motorcicle> implements IMotorcicleDAO {

  public MotorcicleDAO() {
    super();
    Map<String, Bus> entityMap = (Map<String, Bus>) Storage.getInstance().getMap().get(getClassType());
    if (isNull(entityMap)) {
      entityMap = new HashMap<>();
      Storage.getInstance().getMap().put(getClassType(), entityMap);
    }
  }

  @Override
  public Class<Motorcicle> getClassType() {
    return Motorcicle.class;
  }

  @Override
  public void updateData(Motorcicle newEntity, Motorcicle entity) {
    entity.setFabricationDate(newEntity.getFabricationDate());
    entity.setHorsePower(newEntity.getHorsePower());
    entity.setModelName(newEntity.getModelName());
    entity.setNumberWheels(newEntity.getNumberWheels());
    entity.setFuelCapacityInLiters(newEntity.getFuelCapacityInLiters());
    entity.setPassengersCapacity(newEntity.getPassengersCapacity());
  }
}
