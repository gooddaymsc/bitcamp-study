import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    int[] arr = new int[t];

    for (int i = 0; i < t; i++) {
      int a = scan.nextInt();
      int b = scan.nextInt();

      arr[i] = a + b;
    }

    for (int k : arr) {
      System.out.println(k);
    }

    scan.close();
  }
}
