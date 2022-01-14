package basicprograms;
//  Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.ArrayList;
import java.util.Scanner;

public class maxbyinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ArrayList<Integer> num = new ArrayList<>(5);
        int max = 0, n;

        do {
            n = input.nextInt();
            if (n > max) {
                max = n;
            }
        } while (n != 0);
        System.out.println("maxi is : " + max);
    }

}
