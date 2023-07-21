import java.util.*;
class plussymbol0
{
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=1;i<=n;i++)
        {
            for (int j=1; j<=n; j++)
            {
                if((i==n/2+1)||(j==n/2+1))
                {
                    System.out.print("0 ");
                }
                else
                {
                    System.out.print("1 ");
                }
            }
                    System.out.println("");
        }
    }
}