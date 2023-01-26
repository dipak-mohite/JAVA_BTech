//Write a Java Program to find and print  transpose of a matrix (take input form user)
//Name: Dipak Mohite
//Roll: 236
//Class: DSY-COMPUTER
import java.util.Scanner;
class Transpose{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows : ");
        int n=sc.nextInt();
        System.out.print("Enter number of Columns : ");
        int m=sc.nextInt();

        int[][] arr=new int[n][m];
        int[][] transpose=new int[n][m];
        
        System.out.println("\nEnter the matrix for Array 1 : ("+n+"x"+m+")");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print("["+i+"]["+j+"] = ");
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("\nYour Entered Matrix:");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print("\t"+arr[i][j]);
            }
            System.out.println();
        }

        //Calculating Transpose 
        for(int i=0;i<transpose.length;i++)
        {
            for(int j=0;j<transpose[i].length;j++)
            {
                transpose[i][j]=arr[j][i];
            }
        }
        //Printing Transpose 
        System.out.println("\nTranspose :");
        for(int i=0;i<transpose.length;i++)
        {
            for(int j=0;j<transpose[i].length;j++)
            {
                System.out.print("\t"+transpose[i][j]);
            }
            System.out.println();
        }
    }
}
