package com.exercises.modules.seventeen.second.domain;

import com.exercises.modules.seventeen.second.enums.BreakType;
import com.exercises.modules.seventeen.second.enums.DirectionType;
import com.exercises.modules.seventeen.second.enums.FuelType;

public class Peugeout extends Car {

  private boolean iCockpit;

  public Peugeout(long code, String model, DirectionType directionType, BreakType breakType, FuelType fuelType, int fabricationYear, int horsePower, int fuelCapacity, int maxSpeed, boolean iCockpit) {
    super(code, model, directionType, breakType, fuelType, fabricationYear, horsePower, fuelCapacity, maxSpeed);
    this.iCockpit = iCockpit;
  }

  public boolean isiCockpit() {
    return iCockpit;
  }

  public void setiCockpit(boolean iCockpit) {
    this.iCockpit = iCockpit;
  }
}
