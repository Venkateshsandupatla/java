package basicprograms;

import java.util.Scanner;

public class operators {
    // Take in two numbers and an operator (+, -, *, /) and calculate the value.
    // (Use if conditions)

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int num1 = input.nextInt();
        System.out.println("Enter the number1: ");
        int num2 = input.nextInt();
        System.out.println("Enter the operator: ");
        String oper = input.next();
        int ans;
        switch (oper) {
            case "+":
                ans = num1 + num2;
                System.out.println(ans);
                break;
            case "-":
                ans = num1 - num2;
                System.out.println(ans);

                // System.out.println(num1 - num2);
                break;
            case "*":
                ans = num1 * num2;
                System.out.println(ans);
                // System.out.println(num1 * num2);
                break;
            case "/":
                ans = num1 / num2;
                System.out.println(ans);
                // System.out.println(num1 / num2);
                break;

            default:

                break;
        }
        // System.out.println(ans);

    }

}
