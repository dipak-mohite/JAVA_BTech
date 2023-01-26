//Name : Dipak Mohite
//Roll : 236
//Class : DSY-Computer

import java.util.Scanner;
interface Employee {
    double calculateSalary();
    void displayEmployeeInfo();
}

class Manager implements Employee {
    private String name;
    private double hourlyRate=1800;
    private double hoursWorked;
    public Manager(String name, double hoursWorked) {
        this.name = name;
        this.hoursWorked = hoursWorked;
    }
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    public void displayEmployeeInfo() {
        System.out.println("Name: " + name);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class Developer implements Employee {
    private String name;
    private double hourlyRate=1200;
    private double hoursWorked;
    public Developer(String name, double hoursWorked) {
        this.name = name;
        this.hoursWorked = hoursWorked;
    }
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    public void displayEmployeeInfo() {
        System.out.println("Name: " + name);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------------------------");
		System.out.println("\tStudent Name : Dipak Mohite ");
		System.out.println("\tRoll No. : 236 ");
		System.out.println("\tClass : DSY-Comp ");
		System.out.println("----------------------------------------\n");
		
		
		System.out.println("Enter Manager Details :");
		System.out.print("Name : ");
		String mname = sc.next();
		System.out.print("Hours Worked : ");
		double mhwork = sc.nextDouble();
		System.out.println("\nEnter Developer Details :");
		System.out.print("Name : ");
		String dname = sc.next();
		System.out.print("Hours Worked : ");
		double dhwork = sc.nextDouble();
		
        Manager manager = new Manager(mname,mhwork);
        Developer developer = new Developer(dname,dhwork);
		System.out.println("----------------------------------------");
		System.out.println("\tSalary Details of Manager");
        manager.displayEmployeeInfo();
		System.out.println("----------------------------------------");
		System.out.println("\tSalary Details of Developer");
        developer.displayEmployeeInfo();
    }
}