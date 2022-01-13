package linandbinarysearch;

import java.util.Scanner;

public class minandmax {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("ENter the elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int min = minimum(arr);
        int max = maximum((arr));
        System.out.println("maximum is : " + max);
        System.out.println("minimum is :" + min);
    }

    static int maximum(int[] arr) {
        int maxi = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        return maxi;
    }

    static int minimum(int[] arr) {
        int mini = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }
        return mini;
    }
}
