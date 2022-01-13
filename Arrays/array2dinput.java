package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array2dinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arr = new int[3][3];
        // arr.length gives the number of columns
        // this for loop is for input 2d array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }
        // for output
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");

            }
            System.out.println();
        }

        // output using array.string
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));

        }

        // using for each loop

        for (int[] num : arr) {
            System.out.println(Arrays.toString(num));

        }
    }

}
