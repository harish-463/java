import java.util.*;
class shortestpath
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        if(n<2)
        {
            System.out.println("Invalid input:"+n);
        }
        else
        {
            System.out.println(a[0]+" "+a[1]);
 }
}
}
