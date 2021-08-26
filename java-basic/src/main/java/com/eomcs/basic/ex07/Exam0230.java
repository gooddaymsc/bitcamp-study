// java.util.HashSet 클래스 사용 - 값을 꺼내는 방법 : for(:)
package com.eomcs.basic.ex07;

import java.util.HashSet;

public class Exam0230 {
  public static void main(String[] args) {

    HashSet<String> set = new HashSet<>();
    set.add("aaa");
    set.add("bbb");
    set.add("ccc");
    set.add("ddd");
    set.add("eee");

    // Iterable 구현체라면 다음과 같이 for(:)를 사용하여 값을 조회할 수 있다.
    for (String s : set) {
      System.out.print(s + ',');
    }
    System.out.println();
  }
}


