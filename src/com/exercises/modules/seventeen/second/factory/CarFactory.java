package com.exercises.modules.seventeen.second.factory;

import com.exercises.modules.seventeen.second.domain.Car;

public interface CarFactory {

  Car buildEntity(String[] properties);
}
