import java.util.Scanner;

public class fibonciiseries {
    public static void main(String[] args) {
        // fiboncii series
        int a = 0;
        int b = 1;
        int c, i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        System.out.print(a);
        System.out.print(" " + b);
        for (i = 2; i <= num; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        // i = 2;
        // while (i <= num) {
        // c = a + b;
        // System.out.print(" " + c);
        // a = b;
        // b = c;
        // i++;

        // }

    }
}
