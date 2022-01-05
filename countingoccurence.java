import java.util.Scanner;

public class countingoccurence {
    public static void main(String[] args) {
        // we are going to count the number of times a number in our number
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        System.out.println("Enter the number you have to find the count");
        int cn = input.nextInt();
        int count = 0;
        while (n > 0) {
            if (n % 10 == cn) { // n%10 gives the last digit of number
                count++;
            }
            n = n / 10; // n / 10 gives the remainng digits of number (except last digit)
        }
        System.out.println(" the count of number is : " + count);

    }

}
