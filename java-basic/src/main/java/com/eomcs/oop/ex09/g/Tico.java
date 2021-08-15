package com.eomcs.oop.ex09.g;

public class Tico extends AbstractCar {

  int gas;
  int brakeOil;
  int engineOil;

  @Override
  public void run() {
    System.out.println("붕붕~~ 잘 달린다!");

  }

  @Override
  public int getGas() {
    return gas = 1;
  }
  @Override
  public int getBrakeOil() {
    return brakeOil = 1;
  }
  @Override
  public int getEngineOil() {
    return engineOil = 1;
  }
}
