package msc;
class SutdaCard1 {

  int a; //3
  boolean b; //false

  SutdaCard1 () {
    this.a = 1;
    this.b = true;
  }
  SutdaCard1 (int a, boolean b) {
    this.a = a;
    this.b = b;
  }

  String info () {
    return a + (b? "K" : "");
  }
}

public class Exercise6_2 {
  public static void main(String args[]) {
    SutdaCard1 card1 = new SutdaCard1(3, false);
    SutdaCard1 card2 = new SutdaCard1();
    System.out.println(card1.info()); //3
    System.out.println(card2.info()); //1K
  }
}