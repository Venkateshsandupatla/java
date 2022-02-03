package basicprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter the radius of circle: ");
        // int r = input.nextInt();
        // System.out.println(Math.PI * (Math.pow(r, 2)));
        // System.out.println(square());
        // System.out.println(3 / 2);
        // int[][] ar = { { 1, 2, 3, 4, 5 },
        // { 6, 7, 8, 9, 10 }
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int k = input.nextInt();

        int start = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                start = i;
                break;
            }
        }

        if (start == -1) {
            System.out.println(new int[] { -1, -1 });
        }

        int end = start;
        for (int i = n - 1; i >= start; i--) {
            if (arr[i] == k) {
                end = i;
                break;
            }
        }
        if (start == end) {
            System.out.println(new int[] { -1, -1 });
        } else {
            System.out.println(new int[] { start, end });
        }

        // System.out.println("Hello, World!");
    }

    // };
    // for (int i = 0; i < 5; ++i) {
    // System.out.println(ar[0][i]);
    // }
    // List<Integer> list = new ArrayList<>();
    // List<Integer> ans = new ArrayList<>();
    // ans.add(4);
    // ans.add(3);
    // ans.add(2);
    // ans.add(1);
    // System.out.println(ans.get(0));
    // for (int i = ans.size() - 1; i >= 0; i++) {
    // list.add(ans.get(i));

    // }
    // System.out.println(list.get(0));
    // // System.out.println(17 / 10);

    static int triangle(int breadth, int height) {
        return (1 / 2) * (breadth * height);
    }

    static int square() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of square: ");
        int a = input.nextInt();
        return a * a;
    }

}
