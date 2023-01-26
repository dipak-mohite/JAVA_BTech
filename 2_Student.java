/*	Write a program to display 5 students recoerd as :  Takes  full name of students as input and display.
	Sort the student names in ascending order and Display Students grade as per following rules for grading system:
	a. Below 25 - F
	b. 25 to 45 - E
	c. 45 to 50 - D
	d. 50 to 60 - C
	e. 60 to 80 - B
	f. Above 80 - A
	Ask user to enter marks and print the corresponding grade.	*/

import java.util.Scanner;

class Student_Grading{
	String name;
	int roll, marks; 
	char grade;
	Scanner sc = new Scanner(System.in);
	
	//method for taking input from user
	public void getStudentInfo()
	{
		System.out.print("\nStudent Name: ");
		name = sc.nextLine();
		System.out.print("Roll No.: ");
		roll = sc.nextInt();
		do{
			System.out.print("Marks: ");
			marks= sc.nextInt();
		}while(marks<0&&marks>100);
		
	}

	//method for calculating grade usiing student marks
	public void calculate_Grade()
	{
		if(marks<25)
		{
			grade='F';
		} 
		else if(marks>=25&&marks<45)
		{
			grade='E';
		} 
		else if(marks>=45&&marks<50)
		{
			grade='D';
		} 
		else if(marks>=50&&marks<60)
		{
			grade='C';
		} 
		else if(marks>=60&&marks<80)
		{
			grade='B';
		} 
		else if(marks>=80)
		{
			grade='A';
		}
	}

	//method for displaying student data
	public void displayInfo()
	{
		System.out.println(roll+"\t"+name+"\t"+marks+"\t"+grade);
	}
}

public class Student{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        System.out.println("========================================================== Assignment 02: =========================================================================");
        System.out.println("Task- Take the details of 5 Students form user and calculate their Grade and display the student record in ascending order accoring to thier Grades.");
        System.out.println("* Student Name: Dipak Mohite");
        System.out.println("* Roll NO: 236");
        System.out.println("* Class: DSY-Comp");
        System.out.println("* Subject: JAVA");
        System.out.println("====================================================================================================================================================");
		Student_Grading std[];
		std = new Student_Grading[6];

		//taking student information from user
		for(int i=0;i<5;i++)
		{
			std[i]=new Student_Grading();
			System.out.print("\nEnter the Details of Student "+(i+1));
			std[i].getStudentInfo();
			std[i].calculate_Grade();
		}
		
		//displaying student informtaion
		System.out.println("\nUser Entered Student Record: ");
		System.out.println("\nRoll\tName\t\tMarks\tGrade");
		for(int i=0;i<5;i++)
		{
			std[i].displayInfo();
		}

		//sorting list of students according thier marks(it also means that list will sort according grades of students)
		
		std[5]=new Student_Grading();
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(std[j].marks<std[i].marks)
				{
					std[5].roll=std[i].roll;
					std[5].name=std[i].name;
					std[5].marks=std[i].marks;
					std[5].grade=std[i].grade;
					
					std[i].roll=std[j].roll;
					std[i].name=std[j].name;
					std[i].marks=std[j].marks;
					std[i].grade=std[j].grade;

					std[j].roll=std[5].roll;
					std[j].name=std[5].name;
					std[j].marks=std[5].marks;
					std[j].grade=std[5].grade;

				}
			}
		}

		//displaying student informtaion
		System.out.println("\nSorted Student Record:");
		System.out.println("\nRoll\tName\t\tMarks\tGrade");
		for(int i=0;i<5;i++)
		{
			std[i].displayInfo();
		}
	}
}