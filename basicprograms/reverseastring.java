package basicprograms;

import java.util.Scanner;

public class reverseastring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = input.next();
        int start = 0;
        int end = name.length() - 1;
        char[] ar = name.toCharArray(); // now we will convert our string into char arra like -> "venky" to
                                        // 'v','e','n','k','y'
        while (start <= end) {
            char temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;

            start++;
            end--;

        }
        System.out.println(ar);
    }

}
