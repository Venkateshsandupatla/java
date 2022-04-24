package sort;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
       int [] arr = {3,1,5,4,2};
       bsort(arr);
       System.out.println(Arrays.toString(arr));
    }

    static void bsort(int[] arr) {
        // for every one loop the largest numbber comes at the end
        for (int i = 0; i < arr.length; i++) {
            boolean swapp = false;
            // now the inner loop we will compare two numbers and swap them
            for (int j = 1; j <= arr.length - i - 1; j++) { // arr.length-1-i because we no need to check last number
                                                            // after every loop of i
                int temp = arr[j];
                if (arr[j] < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapp = true;
                }
            }
            if (swapp=false) {
                break;
            }

        }
    }
}
