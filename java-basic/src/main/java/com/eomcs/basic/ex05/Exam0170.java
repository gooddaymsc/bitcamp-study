// Stack 클래스 사용법 - Iterator 사용
package com.eomcs.basic.ex05;

import java.util.Iterator;
import java.util.Stack;

public class Exam0170 {

  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();

    // push() - 스택의 맨 마지막에 값을 추가한다.
    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");

    Iterator<String> iterator = stack.iterator();

    for (String s : stack) { // iterable 구현체는 다 넣을 수 있다.
      System.out.println(s);
    }

  }

}

