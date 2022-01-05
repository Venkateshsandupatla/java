import java.util.Scanner;

public class reverseofnumber {
    public static void main(String[] args) {
        // we have to reverse the number
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        int rem, reverse = 0;
        while (num > 0) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        System.out.println("Reverse number is : " + reverse);
    }

}
