package basicprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];
        ArrayList<Integer> ans = new ArrayList<>(10);
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < N; i++) {

            int square = arr[i] * arr[i];
            if (square == arr[i]) {
                ans.add(arr[i]);

            }

        }
        System.out.println(ans);

    }
}
