import java.util.Scanner;

public class num {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print: ");
        int number = sc.nextInt();

        for (int a=0; a<7; a++) {
            for (int b=0; b<16; b++) {
                if ((a==0 && b==0) || (a==0 && b==12) || (a==1 && b==1) || (a==1 && b==11) || (a==1 && b==13) ||
                        (a==2 && b==2) || (a==2 && b==10) || (a==2 && b==14) || (a==3 && b==3) || (a==3 && b==9) ||
                        (a==3 && b==15) || (a==4 && b==4) || (a==4 && b==8) || (a==5 && b==5) || (a==5 && b==7) ||
                        (a==6 && b==6)) {
                    if (number > 0 && number <= 16) {
                        System.out.print(number);
                        number++;
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
