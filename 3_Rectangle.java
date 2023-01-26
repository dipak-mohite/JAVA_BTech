/*  Student Name: Dipak Mohite
    Roll: 236
    Class: DSY-Computer
    Subject: JAVA                                           
    Assignment 02: Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
    First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea'
    returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.      */
    import java.util.Scanner;
    class Area{
        Scanner sc = new Scanner(System.in);
        int length, breadth, area;
        void setDim(){
            System.out.println("\n*Enter the dimensions of the rectangle");
            System.out.print("Length = ");
            length = sc.nextInt();
            System.out.print("Breadth = ");
            breadth = sc.nextInt();
        }
        int getArea(){
            //Area of Rectangle = Length*Breadth
            area = length*breadth;
            return area;
        } 
    }
    class Rectangle{
        public static void main(String[] args)
        {
            System.out.println("\n=============== Assignnment NO.: 03 ===============");
            System.out.println("* Student Name: Dipak Balu Mohite");
            System.out.println("* Roll NO: 236");
            System.out.println("* Class: DSY-Computer");
            System.out.println("* Subject: JAVA");
            System.out.println("====================================================");
    
            Area a = new Area();
            a.setDim();
            System.out.println("Area of Rectangle = "+a.getArea());	     
        }
    }


    