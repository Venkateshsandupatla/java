package functions;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        // int ans = sum2();
        // System.out.println(ans);
        int ans = sum3(3, 8);
        System.out.println(ans);
        // int aa = sum4();

    }

    static int sum4() {
        return 0;
    }

    // with return type in this function we gev return type as int that means
    // whenever the function is called the function holds a integer after the
    // execution of function
    // sum function with arguments
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

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
