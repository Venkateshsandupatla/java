package basicprograms;

import java.util.Scanner;

//  Write a program to print whether a number is even or odd, also take input
public class evenorodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        String ans = odeven(n);
        System.out.println(ans);
    }

    static String odeven(int n) {
        if (n % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }

    }

}
