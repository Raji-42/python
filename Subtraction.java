//java program to Subtraction two integers
//22.08.23
//Subtraction
//Rajeswari
import java.io.*;
import java.util.*;
class Subtraction
{
   public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.print("enter first integer ");
     int i1=sc.nextInt();
     System.out.print("enter second integer ");
     int i2=sc.nextInt();
     int i3=i1-i2;
     System.out.println(i1+ " - " +i2+ " = " +i3);
   }
}
