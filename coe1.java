import java.util.Scanner;

public class coe1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int i, j;
        for (i =0; i<= n; i++)
        {
            for (j =i; j < i+1 ; j++)
            {
                System.out.print("#");
            }
        }
    }
}
