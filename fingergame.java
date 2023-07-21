import java.util.Scanner;
public class fingergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        int finger = findFinger(number);
        System.out.println( getFingerName(finger) );
    }
    public static int findFinger(int number) {

        int finger = number % 8 ;
        return finger;
    }
    public static String getFingerName(int finger) {

        switch (finger) {
            case 1:
                case 9:
                return "thumb";
            case 2:
            case 8:
                return "index";
            case 3:
            case 7:
                return "middle";
            case 4:
            case 6:
                return "ring";
            case 5:
            case 10:
                return "little";
            default:
                return "";
        }
    }
}
