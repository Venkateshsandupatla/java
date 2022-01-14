package basicprograms;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of given number is : " + fact);
    }

    // static int fac(int num) {

    // while (num - 1 != 0) {
    // int fa = num * num - 1;
    // fac(num);
    // return fa;

    // }

}
