package twodarraysearch;

import java.util.Arrays;

public class sortedmatrixsearch {
        public static void main(String[] args) {

                int[][] mat = {
                                { 10, 20, 30, 40 },
                                { 15, 25, 35, 45 },
                                { 28, 29, 37, 49 },
                                { 33, 34, 38, 50 }
                };
                int target = 34;
                int[] ans = result(mat, target);
                System.out.println(Arrays.toString(ans));
        }

        static int[] result(int[][] mat, int target) {
                int row = 0;
                int col = mat[0].length - 1;
                while (row < mat.length && col >= 0) {
                        if (mat[row][col] == target) {
                                return new int[] { row, col };
                        } else if (mat[row][col] > target) {
                                col--;
                        } else if (mat[row][col] < target) {
                                row++;
                        }
                }
                return null;

        }
}
