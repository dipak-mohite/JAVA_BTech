package package4;
import java.util.*;
public class Div {
  int s;
  public void divd() {
    System.out.print("Enter the first number: ");
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    System.out.print("Enter the second number: ");
    Scanner scan1 = new Scanner(System.in);
    int y = scan1.nextInt();
    s = x / y;
    System.out.println("Division =" + s);
  }
}