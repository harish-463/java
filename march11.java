import java.util.*;

public class march11{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int[] pos=new int[n];
        for (int i=0;i<n;i++)
        {
            pos[i]=sc.nextInt();
        }
        Arrays.sort(pos);
        int Fc=Integer.MAX_VALUE;
        int Alignment=2;
        System.out.println("Fuel Costs are");
        for (int a=pos[0];a<=pos[n-1];a++)
        {
            int fc=0;
            for (int i=0;i<n;i++)
            {
                fc+=Math.abs(pos[i]-a);
            }
            System.out.println(fc);
            if (fc<Fc)
            {
                Fc=fc;
                Alignment=a;
            }
        }
        System.out.println("\nMin Fuel cost: " +Fc);
}
}

