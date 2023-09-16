//ThisDemo1
//16-9-23
//rajeswari
import java.io.*;
class Student{
    int RollNumber;
    String Name;
    float Fee;
    Student(int RollNumber,String Name,float Fee)
    {
        RollNumber = RollNumber;
        Name = Name;
        Fee = Fee;
    }
    void display()
    {
        System.out.println("Student details are");
        System.out.println(RollNumber+" "+Name+" "+Fee);
    }
}
    public class ThisDemo1
    {
        public static void main(String args[])
        {
            Student s1 = new Student(4242,"N.Rajeswari",45700);
            Student s2 = new Student(4234,"K.Sushma",45700);
            s1.display();
            s2.display();
        }
    }
