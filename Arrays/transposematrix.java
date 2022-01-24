package Arrays;

// https://leetcode.com/problems/transpose-matrix/
//      Given a 2D integer array matrix,return the transpose of matrix.

// The transpose of a matrix is the matrix flipped over its main diagonal,switching the matrix'srow and column indices.

public class transposematrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int[][] ans = transpose(matrix);
        System.out.println(ans[0][1]);
    }

    static int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] ans = new int[c][r];
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                ans[col][row] = matrix[row][col];
            }
        }
        return ans;
    }
}
