//ThisConstructorDemo
//16-9-23
//rajeswari
import java.io.*;
class A
{
    A()
    {
        System.out.println("inside defalt constructor");
    }
    A(int x)
    {
        this();
        System.out.println("inside parameterized constructure");
        System.out.println("x value is"+x);
    }
}
public class ThisConstructorDemo
{
    public static void main(String args[])
    {
        A a = new A(4242);
    }
}
