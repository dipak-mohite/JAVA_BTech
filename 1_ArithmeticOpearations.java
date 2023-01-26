import java.util.Scanner;

class ArithmeticOpearations{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        float result;
        System.out.println("=====================================================================================================================================================");
        System.out.println("* Assignment 01: Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.(Take Input from user ).");
        System.out.println("* Student Name: Dipak Mohite");
        System.out.println("* Roll NO: 236");
        System.out.println("* Class: DSY-Comp");
        System.out.println("* Subject: JAVA");
        System.out.println("=====================================================================================================================================================");

        int stop=1;
        do{
            System.out.println("\n===========MENU=========");
            System.out.println("1. Addition\n2. Substraction\n3. Multiplication\n4. Division\n5. Reminder\n6. All above Operations\n7. Exit");   
            System.out.println("========================");
            System.out.print("Enter Your Choice = ");
            int choice = sc.nextInt();
            System.out.println("========================");

            switch (choice) {
                case 1:
                    System.out.print("\nEnter 1st Number = ");
                    num1 = sc.nextInt();
                    System.out.print("Enter 2nd Number = ");
                    num2 = sc.nextInt();
                    result=num1+num2;
                    System.out.println("Addition of "+num1+" and "+num2+" = "+result);
                    break;
                case 2:
                    System.out.print("\nEnter 1st Number = ");
                    num1 = sc.nextInt();
                    System.out.print("Enter 2nd Number = ");
                    num2 = sc.nextInt();
                    result=num1-num2;
                    System.out.println("Substraction  of "+num1+" and "+num2+" = "+result);
                    break;
                case 3:
                    System.out.print("\nEnter 1st Number = ");
                    num1 = sc.nextInt();
                    System.out.print("Enter 2nd Number = ");
                    num2 = sc.nextInt();
                    result=num1*num2;
                    System.out.println("Multiplication of "+num1+" and "+num2+" = "+result);
                    break;
                case 4:
                    System.out.print("\nEnter 1st Number = ");
                    num1 = sc.nextInt();
                    System.out.print("Enter 2nd Number = ");
                    num2 = sc.nextInt();
                    result=num1/num2;
                    System.out.println("Division of "+num1+" and "+num2+" = "+result);
                    break;
                case 5:
                    System.out.print("\nEnter 1st Number = ");
                    num1 = sc.nextInt();
                    System.out.print("Enter 2nd Number = ");
                    num2 = sc.nextInt();
                    result=num1%num2;
                    System.out.println("Reminder of "+num1+" and "+num2+" = "+result);
                    break;
                case 6:
                    System.out.print("\nEnter 1st Number = ");
                    num1 = sc.nextInt();
                    System.out.print("Enter 2nd Number = ");
                    num2 = sc.nextInt();
                    System.out.println("Addition of "+num1+" + "+num2+" = "+(num1+num2));
                    System.out.println("Substraction of "+num1+" - "+num2+" = "+(num1-num2));
                    System.out.println("Multiplication of "+num1+" * "+num2+" = "+(num1*num2));
                    System.out.println("Division of "+num1+" / "+num2+" = "+(num1/num2));
                    System.out.println("Reminder of "+num1+" % "+num2+" = "+(num1%num2));
                   break;
                case 7:
                    System.out.println("You choosed Exit, Thank You..!");
                    stop=0;
                    break;
                default:
                    System.out.println(choice+" is an Invalid Choice, Please try again..!");
                    break;
            }
        }while(stop==1);
    }
}