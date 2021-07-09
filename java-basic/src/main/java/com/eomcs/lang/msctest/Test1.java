package gooddaymsc;

import java.sql.Date;
import java.util.Scanner;

public class Test1 {

  public static void main(String[] args) {

    Scanner keyboardScan = new Scanner(System.in);

    System.out.print("시작일? ");
    Date startDate = Date.valueOf(keyboardScan.nextLine());

    System.out.println(startDate);
  }
}
