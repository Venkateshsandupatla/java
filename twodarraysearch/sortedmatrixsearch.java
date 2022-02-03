package twodarraysearch;

public class sortedmatrixsearch {
        public static void main(String[] args) {

                int[][] mat = {
                                { 10, 20, 30, 40 },
                                { 15, 25, 35, 45 },
                                { 28, 29, 37, 49 },
                                { 33, 34, 38, 50 }
                };
                int target = 37;
                int[] ans = result(mat, target);
                System.out.println(ans);
        }

        static int[] result(int[] mat, int target) {
                int row = 0;
                int col = mat[0].length - 1;
                while (row < mat.length && col >= 0) {
                        if (arr[row][col] == target) {
                                return new int[] { row, col };
                        } else if (arr[row][col] > target) {
                                col--;
                        } else if (arr[row][col] < target) {
                                row++;
                        }
                }

        }
}
