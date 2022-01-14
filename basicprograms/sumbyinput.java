package basicprograms;
// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;

public class sumbyinput {
    public static void main(String[] args) {
        int sum = 0;
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the numbers: ");
        do {
            num = input.nextInt();
            sum = sum + num;
        } while (num != 0);
        System.out.println(sum);
    }

}
