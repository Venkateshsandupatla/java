import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        // basic calculator
        int ans = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            System.out.println("Enter the operator");
            char op = input.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("num2 cant be 0");
                    }
                } else if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                // calcultor will stop
                break;
            } else {
                System.out.println("please enter a valid operator");
            }
            System.out.println(ans);
        }

    }

}
