package com.exercises.modules.seventeen.second.factory;

import com.exercises.modules.seventeen.second.domain.Car;
import com.exercises.modules.seventeen.second.domain.Honda;
import com.exercises.modules.seventeen.second.enums.BreakType;
import com.exercises.modules.seventeen.second.enums.DirectionType;
import com.exercises.modules.seventeen.second.enums.FuelType;

public class HondaFactory implements CarFactory {
  @Override
  public Car buildEntity(final String[] properties) {
    return new Honda(
        Long.parseLong(properties[0]),
        properties[1],
        DirectionType.valueOf(properties[2].toUpperCase()),
        BreakType.valueOf(properties[3].toUpperCase()),
        FuelType.valueOf(properties[4].toUpperCase()),
        Integer.parseInt(properties[5]),
        Integer.parseInt(properties[6]),
        Integer.parseInt(properties[7]),
        Integer.parseInt(properties[8]),
        Boolean.parseBoolean(properties[9]),
        Boolean.parseBoolean(properties[10]));
  }
}
