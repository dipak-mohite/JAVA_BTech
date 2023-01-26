import java.util.*;
import package1.*;
import package2.*;
import package3.*;
import package4.*;

public class Calculator {
  public static void main(String args[]) {
    System.out.print("-----------------------------------------\n\tName : Dipak Mohite\n\tRoll No.: 236\n\tClass : DSY-Computer");
    Scanner sc = new Scanner(System.in);
	int flag=1;
    do{
	System.out.print("\n-----------------------------------------\n\t\tMENU\n-----------------------------------------\n1.Addition \n2.Substraction \n3.Multiplication \n4.Division  \n5.Exit \n-----------------------------------------\nEnter your choice : ");
    int ch = sc.nextInt();
	switch (ch) {
    case 1:
      Add a = new Add();
      a.sum();
      break;
    case 2:
      Subs b = new Subs();
      b.minus();
      break;
    case 3:
      Mul m = new Mul();
      m.pro();
      break;
    case 4:
      Div d = new Div();
      d.divd();
      break;
    case 5:
      flag=0;
      break;
	default:
		System.out.println("\nInvalid Choice..!");
		break;
    }
	}while(flag!=0);
  }
}