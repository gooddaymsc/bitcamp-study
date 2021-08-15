// inner class : 바깥 클래스의 인스턴스 멤버에 접근하기 III
package com.eomcs.oop.ex11.c;

class B4 {

  // 인스턴스 멤버
  int v1 = 10;

  class X {
    int v2 = 100;

    void test() {
      int v3 = 1000;

      // 인스턴스 멤버에 접근 가능
      // =>   바깥클래스명.this.인스턴스멤버명
      System.out.printf("v3 = %d\n", v3); // 로컬 변수
      System.out.printf("this.v2 = %d\n", this.v2); // 인스턴스 변수
      System.out.printf("B4.this.v1 = %d\n", B4.this.v1); // 바깥 객체의 인스턴스 변수

      // => inner class 의 가장 큰 특징은 바깥 클래스의 다른 멤버에 손쉽게 접근할 수 있다는 것이다.
      // => 이것이 가능한 이유는 바깥 클래스의 인스턴스 멤버이기 때문이다.
    }
  }
}

public class Exam0240 {

  public static void main(String[] args) {
    B4 outer = new B4();
    outer.v1 = 11;

    B4.X x1 = outer.new X();
    x1.test();
    System.out.println("------------------");

    B4.X x2 = outer.new X();
    x2.test();
    System.out.println("------------------");

    B4 outer2 = new B4();
    outer2.v1 = 12;

    B4.X x3 = outer2.new X();
    x3.test();
    System.out.println("------------------");

  }

}
