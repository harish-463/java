import java.util.Scanner;
class createobject
{
public static void main(String args[])
{	 
int a;
Scanner myobj=new Scanner(System.in);
a=myobj.nextInt();
System.out.println("the value of a is "+a);
if(a%3==0)
{
System.out.println("the number is divisible by 3 ");
}
else
{
System.out.println("the number is not divisible by 3 ");
}
}}
