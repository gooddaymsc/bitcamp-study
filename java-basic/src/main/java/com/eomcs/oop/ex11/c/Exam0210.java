// inner class : 바깥 클래스의 클래스 멤버에 접근하기
package com.eomcs.oop.ex11.c;

class B {
  // 클래스 멤버
  static int v1 = 10;
  static void m1() {}

  class X {
    void test() {
      // 바깥 클래스든 패키지 맴버 클래스든 스태틱 멤버를 사용할 때는
      // 다음과 같이 클래스 이름으로 해당 멤버를 사용한다.
      System.out.println(B.v1);
      B.m1();
      System.out.println("-------------------------");

      // 중첩 클래스에서 바깥 클래스의 스태틱 멤버에 접근할 때는
      // 바깥 클래스 이름을 생략할 수 있어 편하다.
      // 왜? 
      // - 중첩 클래스도 바깥 클래스의 맴버이기 때문에 같은 멤버에 접근할 때는
      //   클래스명을 생략할 수 있다.
      System.out.println(v1); 
      m1(); 
      System.out.println("-------------------------");

      int v2 = 2000;
    }
  }
}

public class Exam0210 {

  public static void main(String[] args) {
    B outer = new B();
    B.X obj = outer.new X();

    obj.test();

  }

}
