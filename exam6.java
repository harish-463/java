import java.util.Scanner;
class exam6
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i==0 && j==4)||(i==0 && j==5)||(i==0 && j==6)||(i==0 && j==7)||(i==3 && j==0)||(i==3 && j==1)||(i==4 && j==0)||(i==4 && j==1)||(i==5 && j==0)||(i==5 && j==1)||(i==6 && j==0)||(i==6 && j==1)||(i==7 && j==0)||(i==7 && j==1)||(i==10 && j==4)||(i==10 && j==5)||(i==10 && j==6)||(i==10 && j==7))
                {
                    System.out.print("#");
                }
                else if((i==1 && j==2)||(i==1 && j==3)||(i==1 && j==8)||(i==1 && j==9)||(i==2 && j==1)||(i==2 && j==2)||(i==2 && j==9)||(i==2 && j==10)||(i==8 && j==1)||(i==8 && j==2)||(i==8 && j==9)||(i==8 && j==10)||(i==9 && j==2)||(i==9 && j==3)||(i==9 && j==8)||(i==9 && j==9))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
