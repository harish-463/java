import java.util.*;
class bananapeanut
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int j = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int banana,peanut;
        banana=0;
        peanut=0;
        if(k>0 && j>0)
        {
            banana=m/k;
            peanut=p/j;
            n=n-banana-peanut;
            System.out.println(n);
        }
        else
        {
            System.out.println("invalid input");
}
}
}