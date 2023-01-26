//Addition,Multiplication of 1 Matrices (take input form user)
//Name: Dipak Mohite
//Roll: 236
//Class: DSY-COMPUTER
import java.util.Scanner;
class array2D{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of Rows : ");
        int n=sc.nextInt();
        System.out.print("Enter number of Columns : ");
        int m=sc.nextInt();

        int[][] arr1=new int[n][m];
        int[][] arr2=new int[n][m];
        
        System.out.println("\nEnter the matrix for Array 1 : ("+n+"x"+m+")");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                System.out.print("["+i+"]["+j+"] = ");
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the matrix for Array 2 : ("+n+"x"+m+")");
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2[i].length;j++)
            {
                System.out.print("["+i+"]["+j+"] = ");
                arr2[i][j]=sc.nextInt();
            }
        }

        System.out.println("\nMatrix 1:");
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                System.out.print("\t"+arr1[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nMatrix 2:");
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2[i].length;j++)
            {
                System.out.print("\t"+arr2[i][j]);
            }
            System.out.println();
        }

        //Addition 
        System.out.println("\nAddition of Matrix 1 and Matrix 2 :");
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2[i].length;j++)
            {
                System.out.print("\t"+(arr1[i][j]+arr2[i][j]));
            }
            System.out.println();
        }

        //Addition
        System.out.println("\nMultiplication of Matrix 1 and Matrix 2 :");
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2[i].length;j++)
            {
                System.out.print("\t"+(arr1[i][j]*arr2[i][j]));
            }
            System.out.println();
        }

    }
}