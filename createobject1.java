import java.util.*;
class createobject1
{
public static void main(String args[])
{	 
int a,b=0;
Scanner myobj=new Scanner(System.in);
a=myobj.nextInt();
System.out.println("the value of a is "+a);
if(a%3==0)
{
System.out.println("the number is divisible by 3 ");
b+=a;
b+=a;
b+=a;
System.out.println("now the number is: "+b);
int length=(int)(Math.log10(b)+1);
if(length==1)
{
System.out.println("0");
}
else if(length==2){
System.out.println("the last digit are"+b%10);
}
else if(length==3){
System.out.println("the last digit are"+b%100);
}
}
else
{
System.out.println("the number is not divisible by 3 ");
}
}}
