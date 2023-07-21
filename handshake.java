import java.util.Scanner;

public class handshake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPeople = scanner.nextInt();
        int totalHandshakes = calculateHandshakes(numOfPeople);

        System.out.println(totalHandshakes);

        scanner.close();
    }

    public static int calculateHandshakes(int numOfPeople) {
        int totalHandshakes = (numOfPeople * (numOfPeople - 1)) / 2;
        return totalHandshakes;
    }
}
