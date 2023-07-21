import java.util.*;

public class devu{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            int n = s.length();
            Map<Character, Integer> counts = new HashMap<>();
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                counts.put(c, counts.getOrDefault(c, 0) + 1);
            }
            List<Map.Entry<Character, Integer>> list = new ArrayList<>(counts.entrySet());
            list.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));
            char[] result = new char[n];
            int index = 0;
            for (Map.Entry<Character, Integer> entry : list) {
                char c = entry.getKey();
                int count = entry.getValue();
                while (count-- > 0) {
                    result[index] = c;
                    index += 2;
                    if (index >= n) {
                        index = 1;
                    }
                }
            }
            boolean possible = true;
            for (int i = 1; i < n; i++) {
                if (result[i] == result[i - 1]) {
                    possible = false;
                    break;
                }
            }
            if (possible) {
                System.out.println(new String(result));
            } else {
                System.out.println("-1");
            }
        }
        scanner.close();
    }
}
