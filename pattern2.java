import java.util.*;
class pattern2
{
public static void main(String args[])
{
int i,j;
Scanner myobj=new Scanner(System.in);
int a = myobj.nextInt();
int b = myobj.nextInt();
System.out.println("the value of a is "+a);
System.out.println("the value of b is "+b);
if(a>b)
{
for(i=1;i<=a;i++)
{
System.out.print("*");
}
System.out.print("\n");
for(j=1;j<=b;j++)
{
System.out.println("*");
}
for(i=1;i<=a;i++)
{
System.out.print("*");
}
}
else
{
System.out.println("does not exit");
}
}
}

