package com.eomcs.oop.ex09.g;

public abstract class AbstractCar implements Car, CarCheckInfo {

  private String maker;
  private String model;
  private int cc;

  // 자동차 기본 기능
  public String getMaker() {
    return maker;
  }
  public void setMaker(String maker) {
    this.maker = maker;
  }
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }
  public int getCc() {
    return cc;
  }
  public void setCc(int cc) {
    this.cc = cc;
  }

  @Override
  public String toString() {
    return String.format("이차의 이름은! %s 자동차!", this.maker);
  }

  // Car 규칙에 따라 기능 구현
  @Override
  public void start() {
    System.out.println("시동 건다!");
  }

  @Override
  public void shutdown() {
    System.out.println("시동 끈다!");
  }

  // Car 인터페이스의 run() 메서드는 구현하지 않는다.
  // - 서브 클래스에게 구현을 맡긴다.
  // - 따라서 run() 메서드는 다음과 같이 추상 메서드로 남겨져 있다.
  // 
  //  public abstract void run();

  // CarCheckInfo 규칙에 따라 기능 구현하기

}
