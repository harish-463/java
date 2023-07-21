import java.io.*;
import java.util.Scanner;

class new3{
    static int x(int n)
    {
        int a = 1;
        for (int i = 2; i <= n; i++)
            a *= i;
        return a;
    }
    static int b(int n, int r)
    {
        int b = x(n) / (x(r) * x(n - r));
        return b;
    }
    static int ways(int m, int w, int n, int k)
    {

        int c = 0;
        while (m >= k) {
            c += b(m, k) * b(w, n - k);
            k += 1;
        }

        return c;
    }
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("m: ");
        int m = sc.nextInt();
        System.out.print("w: ");
        int w = sc.nextInt();
        System.out.print("n: ");
        int n = sc.nextInt();
        System.out.print("k: ");
        int k = sc.nextInt();
        System.out.println(ways(m, w, n, k));
    }
}
