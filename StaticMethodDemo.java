//StaticMethodDemo
//25-9-23
//rajeswari
import java.io.*;
class Student
{
    int rollno;
    String name;
    static String college="SITE";
    Student(int r,String n)
    {
        rollno=r;
        name=n;
    }
    void display()
    {
        System.out.println(rollno+" "+name+" "+college);
    }
}
public class StaticMethodDemo
{
    public static void main(String args[])
    {
        Student s1 = new Student(242,"N.Rajeswari");
        Student s2 = new Student(234,"k.sushma");
        System.out.println("Student details are");
        s1.display();
        s2.display();
    }
}
