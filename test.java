import java.util.*;
class test{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the year");
int year=sc.nextInt();
String x,y,z;
x=(year%400==0)?"leap year":"not leap year";
y=(year%4==0)?"leap year":"not leap year";
z=(year%100==0)?x:y;
System.out.println(z);
}
}