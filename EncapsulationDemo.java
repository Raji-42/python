//EncapsulationDemo
//26-9-23
//rajeswari
 class Student
{
    public String sname;
    private String sphone;
    public String getsphone()
    {
        return sphone;
    }
    public void setsphone(String ph)
    {
        this.sphone=ph;
    }
}
public class EncapsulationDemo
{
    public static void main(String args[])
    {
        Student s = new Student();
        s.sname="rajeswari";
        s.setsphone("799xxxxxxx");
        System.out.println("Student name is "+s.sname);
        System.out.println("Student phone number is "+s.getsphone());
    }
}
