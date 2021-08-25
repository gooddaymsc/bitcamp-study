// Deque의 Iterator와 for 문
package com.eomcs.basic.ex05;

import java.util.ArrayDeque;

public class Exam0230 {

  public static void main(String[] args) {

    ArrayDeque<String> stack = new ArrayDeque<>();

    // 그냥 for(:)문 사용해라.

    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");

    for (String s : stack) {
      System.out.println(s);
    }

  }

}

