package basicprograms;

import java.util.Scanner;

public class greeting {

    // Take name as input and print a greeting message for that name.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name for greeting: ");
        String name = input.next();
        System.out.println("Hi " + name + " Good Morning!");

    }

}
