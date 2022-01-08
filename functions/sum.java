package functions;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);

    }

    // with return type in this function we gev return type as int that means
    // whenever the function is called the function holds a integer after the
    // execution of function

    static int sum2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number two: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter number two: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}
