package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayinput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int[] arr = new int[5];

        // taking input of 5 elements by for loop
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = input.nextInt();
        // }

        // to print tyhe array elements
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // // to output by for each loop
        // for (var num : arr) {
        // System.out.print(num + " ");

        // }

        // to print array element without for loop
        // we have tostring in arrays swhich converts the array elements and print
        // System.out.println(Arrays.toString(arr));

        // for string array input
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }

        // to print
        System.out.println(Arrays.toString(str));
    }
}
