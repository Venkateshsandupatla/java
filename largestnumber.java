import java.util.Scanner;

public class largestnumber {
    public static void main(String[] args) {
        // finding the largestv number in given three numbers
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // lets assume max is a
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println(max);

        // by using math function

        int maxi = Math.max(Math.max(a, b), c);
        System.out.println(maxi);
    }

}
