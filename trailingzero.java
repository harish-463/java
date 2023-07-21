import java.util.Scanner;
public class trailingzero{
     static int zero(int n) {
        if (n < 0)
            return -1;

        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the number: ");
        int n = scanner.nextInt();

        int trailingZeros = zero(n);
        System.out.println(trailingZeros);
    }
}
