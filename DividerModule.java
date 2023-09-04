//java program to dividermodule two intgers
//22.08.23
//DividerModule
//Rajeswari
import java.io.*;
import java.util.*;
class DividerModule
{
   public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.print("enter first integer ");
     int i1=sc.nextInt();
     System.out.print("enter second integer ");
     int i2=sc.nextInt();
     int i3=i1%i2;
     System.out.println(i1+ " % " +i2+ " = " +i3);
   }
}
