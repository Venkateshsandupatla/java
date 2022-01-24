package Arrays;
// https://leetcode.com/problems/matrix-diagonal-sum/

// Given a square matrix mat, return the sum of the matrix diagonals.

// Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

// Example 1:

// Input:mat=[[1,2,3],[4,5,6],[7,8,9]]Output:25 Explanation:Diagonals sum:1+5+9+3+7=25 Notice that element mat[1][1]=5 is counted only once.Example 2:

// Input:mat=[[1,1,1,1],[1,1,1,1],[1,1,1,1],[1,1,1,1]]Output:8 Example 3:

// Input:mat=[[5]]Output:5

// Constraints:

// n==mat.length==mat[i].length 1<=n<=100 1<=mat[i][j]<=100
public class matrixdiagonalsum {

    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3 },
                { 3, 4, 5 },
                { 5, 6, 7 }
        };
        int ans = diagonalSum(mat);
        System.out.println(ans);
    }

    // diagonal there are tow diagonals -> 1. is primary diagonal and seconfd one is
    // secondary daigoal
    // matrix :
    // A00 A01 A02 A03
    // A10 A11 A12 A13
    // A20 A21 A22 A23
    // A30 A31 A32 A33
    // The primary
    // diagonal is
    // formed by
    // the elements A00,A11,A22,A33.

    // Condition for
    // Principal Diagonal:
    // The row
    // column condition
    // is row = column.
    // The secondary
    // diagonal is
    // formed by
    // the elements A03,A12,A21,A30.Condition for
    // Secondary Diagonal:
    // The row-column condition
    // is row = numberOfRows–column-1.
    // the

    static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int row = 0; row < n; row++) {
            sum += mat[row][row] + mat[row][n - 1 - row];

        }
        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2]; // if the matrix is odd number then we will have a middle value of matrix which
                                      // lies in both primary and secondary daigonal so we have to count or sum the
                                      // value only once so we will remove extra summed value
        }

        return sum;
    }

}
