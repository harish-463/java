import java.util.*;
class box

{
    void display()
    {
        int l,b,area;
        Scanner my=new Scanner(System.in);
                l=my.nextInt();
        b=my.nextInt();
        area=l*b;
        System.out.println(area);

    }

}
class main
{
    public static void main(String args[])
    {

        box S=new box();
        S.display();
    }

}