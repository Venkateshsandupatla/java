package basicprograms;

import java.util.Scanner;

public class simpleintrest {

    // Write a program to input principal, time, and rate (P, T, R) from the user
    // and find Simple Interest.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        int p = input.nextInt();
        System.out.print("ENter the time period: ");
        int t = input.nextInt();
        System.out.print("ENte rthe rate of intrest: ");
        int r = input.nextInt();

        int ans = Simpleintrest(p, r, t);
        System.out.println(ans);
    }

    static int Simpleintrest(int p, int r, int t) {

        return p * t * r;
    }

}
