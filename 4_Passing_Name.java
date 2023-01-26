class Student
{
    String name;
    Student()              //Non-parameterized Counstructor
    {
        name="Unknown";
    }
    Student(String n)      //Parameterized Constructor
    {
        name=n;
    }
    void getName()          
    {
        System.out.println(name);
    }
}
public class Passing_Name {
    public static void main(String args[])
    {
        Student student1 = new Student();                   //creating object with no parameter
        Student student2 = new Student("Dipak Mohite");      //creating object with parameter
        //Student Name : Dipak Mohite
        //Roll No.: 236
        //Class: DSY-Computer
  
        System.out.print("\n1st Student Name: ");   
        student1.getName();                    
        System.out.print("2nd Student Name: ");
        student2.getName();
    }  
}




