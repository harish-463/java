import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i <n; i++) {
            array[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++)
            count++;
        System.out.println(count);
    }
}