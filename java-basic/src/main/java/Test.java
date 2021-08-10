
public class Test {

  class SutdaCard {

    int a; //3
    boolean b; //false

    SutdaCard () {
      this.a = 1;
      this.b = true;
    }
    SutdaCard (int a, boolean b) {
      this.a = a;
      this.b = b;
    }

    String info () {
      return a + (b? "K" : "");
    }
  }

  public static void main(String args[]) {
    SutdaCard card1 = new SutdaCard(3, false);
    SutdaCard card2 = new SutdaCard();
    System.out.println(card1.info()); //3
    System.out.println(card2.info()); //1K
  }
}