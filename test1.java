import java.util.*;
public class test1 {
    public static void main(String[] args) {
        int a[]=new int[7];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<7;i++){
            a[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        for(int i=0;i<7;i++){
            if(a[i]==n)
            {
                System.out.println(i);
            }
            else {
                System.out.print("-1");
            }
 }
}
}