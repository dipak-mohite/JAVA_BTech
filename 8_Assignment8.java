//Name : Dipak Mohite
//Roll : 236
//Class : DSY-Computer

import java.util.*;
import java.util.Collections;
class Assignment8 {
  public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
    ArrayList < Integer > list = new ArrayList < Integer > ();
    ArrayList < String > list2 = new ArrayList < String > ();
	System.out.print("Enter Number of Elements : ");
    int n = s.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.print("Enter element at "+(i+1)+" : ");
      int z = s.nextInt();
      list.add(z);
    }
    System.out.print("Input List:");
    System.out.println(list);
    System.out.println("Output:");
    System.out.println("Min value of our list: " + Collections.min(list, null));
    System.out.println("Max value of our list: " + Collections.max(list, null));
	System.out.print("\nEnter Number of Elements : ");
    n = s.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.print("Enter element at "+(i+1)+" : ");
      String z = s.next();
      list2.add(z);
    }	
    System.out.print("Input List:");
    System.out.println(list2);
    boolean allEqual = list2.stream().distinct().count() <= 1;
    if (allEqual == true) {
      System.out.println("All elements are equal.");
    } else {
      System.out.println("All elements are not equal");
    }
  }
}




