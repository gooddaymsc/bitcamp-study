// static nested class : 다른 멤버에 접근하기
package com.eomcs.oop.ex11.b;

class B {
  // 클래스 멤버
  static int v1;
  static void m1() {}

  // 인스턴스 멤버
  int v2;
  void m2() {}

  static void test() {
    B.v1 = 100;
    B.m1();

    v1 = 200;
    m1();

    //    v2 = 100;
    //    m2();
  }

  static class X {
    void test() {
      // 일반적으로 클래스의 스태틱 맴버(필드, 메서드)에 접근 할 때는
      // 다음과 같이 그 클래스의 이름을 명시해야 한다.
      B.v1 = 100;
      B.m1();

      // 클래스 X도 B의 클래스 맴버이기 때문에 바깥클래스 이름을 생략할 수 있다.
      v1 = 200; 
      m1(); 

      // 스태틱 중첩 클래스도 test처럼 스태틱 맴버 이기 때문에
      // B객체를 가르키는 this라는 인스턴스 맴버가 없어 사용할 수 없다.
      // 따라서 바깥 클래스의 인스턴스 맴버에 접근할 수 없다.
      //      v2 = 100; // 컴파일 오류!
      //      m2(); // 컴파일 오류!
    }
  }
}

public class Exam0210 {

  public static void main(String[] args) {
    B.X obj = new B.X();
    obj.test();

    System.out.println(B.v1);

  }

}
