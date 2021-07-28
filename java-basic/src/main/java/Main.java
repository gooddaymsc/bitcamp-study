import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int result = 0;

    for (int i = 1; i <= n; i++) {
      result += i;
    }
    System.out.println(result);
  }
}
