package com.exercises.modules.m17_generics.second.factory;

import com.exercises.modules.m17_generics.second.domain.Car;

public interface CarFactory {

  Car buildEntity(String[] properties);
}
