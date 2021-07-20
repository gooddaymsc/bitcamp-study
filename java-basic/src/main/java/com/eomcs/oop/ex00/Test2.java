package com.eomcs.oop.ex00;

public class Test2 {
  static int a;
  int b;

  // 스태틱 메서드
  // => 클래스를 통해 사용할 수 있는 메서드
  // => 자신이 소속된 클래스의 인스턴스는 필요 없다.
  // => 자신이 소속된 클래스의 스태틱 멤버(변수, 메소드)는 사용할 수 있다.
  static void x1() {
    System.out.println("x1() 호출됨");
    a = 100;
    x2();
  }

  static void x2() {
    System.out.println("x2() 호출됨");
  }

  // 인스턴스 메서드
  // =>
  // =>
  // =>
  //
  void y1() {
    System.out.println("y1() 호출됨");
  }
}
