import java.util.*;
class add
{
    void display1()
    {
        Scanner obj=new Scanner(System.in);
        int a[][]=new int[2][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = obj.nextInt();
        System.out.print(a[0][0]+a[1][0]+"+");
        System.out.println(a[0][1]+a[1][1]+"i");
    }
}
class sub
{
    void display2()
    {
        Scanner x=new Scanner(System.in);
        int a[][]=new int[2][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = x.nextInt();
        System.out.print(a[0][0]-a[1][0]+"+");
        System.out.print(a[0][1]-a[1][1]+"i");
    }
}
class mul
{
    void display3()
    {
        Scanner y=new Scanner(System.in);
        int a[][]=new int[2][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = y.nextInt();
        System.out.print(a[0][0]*a[1][0]-a[0][1]*a[1][1]+"+");
        System.out.print(a[1][0]*a[0][1]+a[0][0]*a[1][1]+"i");
    }
}
class abc
{
    public static void main(String args[])
    {
        add obj=new add();
        obj.display1();
        sub x=new sub();
        x.display2();
        mul y=new mul();
        y.display3();
    }
}
