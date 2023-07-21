import java.util.*;
class sumofdigits
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        while (number > 0 || sum > 9) {
            if (number == 0) {
                number = sum;
                sum = 0;
            }
            sum += number % 10;
            number /= 10;
        }
        
        System.out.println("The sum of digits until single digit of the number = " + sum);
        
    }
}
