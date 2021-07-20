package com.eomcs.oop.ex00;

public class Exam0500 {

  static class Score {

    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float average;

    public void calculate() {
      this.sum = this.kor + this.eng + this.math;
      this.average = this.sum / 3f;
    }
  }

  public static void main(String[] args) {

    Score s = new Score();

    s.name = "홍길동";
    s.kor = 100;
    s.eng = 90;
    s.math = 85;

    s.calculate();

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math,
        s.sum, s.average);
  }
}
