package com.exercises.modules.seventeen.second.factory;

public class Factory implements IFactory {

  @Override
  public CarFactory createFactory(final int option) {
    if(option == 1) return new HondaFactory();
    return new PeugeoutFactory();
  }
}
