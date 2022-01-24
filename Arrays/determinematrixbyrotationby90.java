package Arrays;

import java.util.Arrays;

// https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/

// Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.

// Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
// Output: true
// Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
// Example 2:

// Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
// Output: false
// Explanation: It is impossible to make mat equal to target by rotating mat.

public class determinematrixbyrotationby90 {
    public static void main(String[] args) {
        // for rotating the matrix by 90 degrees we have to
        // first transpose the matrix then reverse the elements in each row
        // in the question we have to find whether the given mat is equla to target
        // matrix after rotating by 90 deg in first time or upto 3 times because ->
        // first 90 then 180 then 270 now 360 whne it is 360 it becomes the same marix
        // as mat so we havet to check for 90 , 180 , 270

        int[][] mat = {
                { 0, 1 },
                { 1, 1 }
        };
        int[][] target = {
                { 1, 0 },
                { 0, 1 }
        };
        boolean ans = findRotation(mat, target);
        System.out.println(ans);
    }

    static boolean findRotation(int[][] mat, int[][] target) {

        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target))
                return true;
            ro(mat);
        }
        return false;

    }

    static void ro(int[][] mat) {
        // first we have to transpose the matrix
        int n = mat.length;
        int c = mat[0].length;
        for (int row = 0; row < n; row++) {
            for (int col = row + 1; col < c; col++) {
                int temp = mat[row][col];
                mat[row][col] = mat[col][row];
                mat[col][row] = temp;
            }
        }
        // now after transpose we have to reverse the elemnts in each row

        for (int row = 0; row < n; row++) {
            int start = 0;
            int end = mat.length - 1;
            while (start < end) {
                int t = mat[row][start];
                mat[row][start] = mat[row][end];
                mat[row][end] = t;
                start++;
                end--;
            }

        }

    }

}
