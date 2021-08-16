package msc;

public class Exercise6_24 {

  /*
    (1) abs메서드를 작성하시오.
   */

  static int abs (int value) {

    return value >= 0 ? value : -value; // 삼항연산자

    //    if (value >= 0 ) {
    //      return value;
    //    } else {
    //      return -value;
    //    }
  }

  public static void main(String[] args)
  {
    int value = 5;
    System.out.println(value+"의 절대값:"+abs(value));
    value = -10;
    System.out.println(value+"의 절대값:"+abs(value));
  }
}
