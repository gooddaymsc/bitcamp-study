package com.eomcs.oop.ex00;

public class Exam0410 {
  public static void main(String[] args) {
    // 1) 인스턴스 메서드 호출
    // => 인스턴스 주소를 가지고 호출해야 한다.

    //    Test2.y1(); 문법 오류(y1메소드가 인스턴스 메소드이기 때문)

    Test2 obj1 = new Test2();
    obj1.y1();

    Test2 obj2 = null;
    obj2.y1();


  }
}