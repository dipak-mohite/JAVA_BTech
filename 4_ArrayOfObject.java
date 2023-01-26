import java.util.Scanner;

class Student
{
    String name;
    int Rollno;
    int Marks;
    
    Student(String name,int Rollno, int Marks)     
    {
        this.name=name;
        this.Rollno=Rollno;
        this.Marks=Marks;
    }
    void getData()          
    {
        System.out.println(name+"\t"+Rollno+"\t"+Marks);
    }
}
public class ArrayOfObject {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String sname;
        int sroll,smarks;

        System.out.print("Enter no of Students: ");
        int len=sc.nextInt();
        Student std[]=new Student[len];

        for(int i =0;i<len;i++)
        {
            System.out.println("\nStudent "+(i+1));
            System.out.print("Name: ");
            sname=sc.next();
            System.out.print("Roll: ");
            sroll=sc.nextInt();
            System.out.print("Marks: ");
            smarks=sc.nextInt();
            std[i] = new Student(sname,sroll,smarks);

        }

        //displaying student details by calling getData method
        System.out.println("\nRoll\tName\tMarks");
        for(int i =0;i<len;i++)
        {
            std[i].getData();
        }
    }  
}
