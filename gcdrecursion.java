public class gcdrecursion {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        int num1 = 132;
        int num2 = 67;

        int result = gcd(num1, num2);
        System.out.println(result);
    }
}
