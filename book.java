import java.util.*;
public class book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] books = new int[n];
        for (int i = 0; i < n; i++) {
            books[i] = sc.nextInt();
        }
        sc.close();
        int amount = m;
        int numBooks = 0;
        List<Integer> bookCosts = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (books[i] <= amount) {
                amount -= books[i];
                numBooks++;
                bookCosts.add(books[i]);
            } else {
                break;
            }
        }
        System.out.println(numBooks);
        for (int cost : bookCosts) {
            System.out.println(cost);
        }
    }
}
