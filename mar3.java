import java.util.ArrayList;
import java.util.Scanner;
public class mar3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        if (q == 1) {
            int p = sc.nextInt();
            int r = sc.nextInt();
            arr.add(p,r);
        } else {
            int p = sc.nextInt();
            arr.remove(p);
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
