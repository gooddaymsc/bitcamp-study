// ArrayDeque
package com.eomcs.basic.ex05;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Exam0220 {

  public static void main(String[] args) {

    ArrayDeque<String> stack = new ArrayDeque<>();

    // 스택 답게 꺼내려면 ArrayDeque 클래스를 사용하라!

    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");

    Iterator<String> iterator = stack.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

  }

}

