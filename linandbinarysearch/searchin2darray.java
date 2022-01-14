package linandbinarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class searchin2darray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("ENter the elements:");

        /// enterning the eleements in 2d array
        // 1 2 3
        // 4 5 6
        // 7 8 9 its our 2d array

        // if we want to search 6 then it prints 1st row 2nd colum ->[1,2]
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }

        }
        int target = 6;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }

        }
        return new int[] { -1, -1 };
    }

}
