//Name: Dipak Mohite
//Roll: 236
//Class: DSY-COMPUTER
//Implementing Different Types of Inheritance for a real life Example
//Vehicle Details Management System
import java.util.Scanner;
class Vehicle{
    Scanner sc = new Scanner(System.in);
    String color;
    String type;

    void getVehicle(){
        System.out.print("Enter color of Vehicle : ");
        color = sc.next();
        System.out.print("Enter type of Vehicle : ");
        type = sc.next();
    }
}

//single level
class Car extends Vehicle{
    String carName;
    void getCar(){
        System.out.print("Enter name of Car : ");
        carName = sc.next();
    }
}

//multilevel
class Fortuner extends Car{
    int fortunerPrice;
    void getFortuner()
    {
        System.out.print("Enter price of Fortuner : ");
        fortunerPrice = sc.nextInt();
    }
    void displayFortuner()
    {  
        System.out.println("Color of Vehicle : "+color);
        System.out.println("Type of Vehicle : "+type);
        System.out.println("Name of Car : "+carName);
        System.out.println("Price of Fortuner : "+fortunerPrice);
    }
}

//hierarchical
class Bike extends Vehicle{
    String bikeName;
    void getBike(){
        System.out.print("Enter name of Bike : ");
        bikeName = sc.next();
    }
}

//multilevel
class RoyalEnfield extends Bike{
    int royalEnfieldPrice;
    void getRoyalEnfield()
    {
        System.out.print("Enter price of RoyalEnfield : ");
        royalEnfieldPrice = sc.nextInt();
    }

    void displayRoyalEnfield()
    {  
        System.out.println("Color of Vehicle : "+color);
        System.out.println("Type of Vehicle : "+type);
        System.out.println("Name of Car : "+bikeName);
        System.out.println("Price of Fortuner : "+royalEnfieldPrice);

    }
}

public class VehicleDemo {
    public static void main(String args[])
    {
        
        System.out.println("\n============== VEHICLE MANAGEMENT SYSTEM ============");
        Fortuner obj1 = new Fortuner();
        System.out.println("\n********** Fill The Details of 1st Vehicle **********99");
        obj1.getVehicle();
        obj1.getCar();
        obj1.getFortuner();

        System.out.println("\n********** Fill The Details of 2nd Vehicle **********");
        RoyalEnfield obj2 = new RoyalEnfield();
        obj2.getVehicle();
        obj2.getBike();
        obj2.getRoyalEnfield();
        System.out.println("\n********** Displaying the Details of 1st Vehicle **********");
        obj1.displayFortuner();
        System.out.println("\n********** Displaying the Details of 2nd Vehicle **********");
        obj2.displayRoyalEnfield();
    }
    
}
