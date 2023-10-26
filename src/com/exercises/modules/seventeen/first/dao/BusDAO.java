package com.exercises.modules.seventeen.first.dao;

import com.exercises.modules.seventeen.first.Storage;
import com.exercises.modules.seventeen.first.dao.generic.GenericDAO;
import com.exercises.modules.seventeen.first.domain.Bus;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.isNull;

public class BusDAO extends GenericDAO<Bus> implements IBusDAO {

  public BusDAO() {
    super();
    Map<String, Bus> entityMap = (Map<String, Bus>) Storage.getInstance().getMap().get(getClassType());
    if (isNull(entityMap)) {
      entityMap = new HashMap<>();
      Storage.getInstance().getMap().put(getClassType(), entityMap);
    }
  }

  @Override
  public Class<Bus> getClassType() {
    return Bus.class;
  }

  @Override
  public void updateData(Bus newEntity, Bus entity) {
    entity.setFabricationDate(newEntity.getFabricationDate());
    entity.setHorsePower(newEntity.getHorsePower());
    entity.setModelName(newEntity.getModelName());
    entity.setPassengersCapacity(newEntity.getPassengersCapacity());
    entity.setNumberWheels(newEntity.getNumberWheels());
    entity.setFuelCapacityInLiters(newEntity.getFuelCapacityInLiters());
  }
}
