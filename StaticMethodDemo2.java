//StaticMethodDemo2
//25-9-23
//rajeswari
import java.io.*;
class Student
{
    int rollno;
    String name;
    static String college="SITE";
    static void changecollege()
    {
        college="SASI";
    }
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
public class StaticMethodDemo2
{
    public static void main(String args[])
    {
        System.out.println("Student details are");
        Student s1 = new Student(242,"N.Rajeswari");
        s1.display();
        Student.changecollege();
        Student s2 = new Student(234,"k.sushma");
        s2.display();
    }
}
