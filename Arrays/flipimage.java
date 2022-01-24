package Arrays;
// //  https://leetcode.com/problems/flipping-an-image/

import java.util.Arrays;

// Given an n x n binary matrix image,flip the image horizontally,then invert it,and return the resulting image.

// To flip an image horizontally means that each row of the image is reversed.

// For example,flipping[1,1,0]horizontally results in[0,1,1].To invert an image means that each 0 is replaced by 1,and each 1 is replaced by 0.

// For example,inverting[0,1,1]results in[1,0,0].

// Example 1:

// Input:image=[[1,1,0],[1,0,1],[0,0,0]]Output:[[1,0,0],[0,1,0],[1,1,1]]Explanation:First reverse each row:[[0,1,1],[1,0,1],[0,0,0]].Then,invert the image:[[1,0,0],[0,1,0],[1,1,1]]Example 2:

// Input:image=[[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]Output:[[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]Explanation:First reverse each row:[[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].Then invert the image:[[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]

// Constraints:

// n==image.length n==image[i].length 1<=n<=20 images[i][j]is either 0 or 1.

public class flipimage {

    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 0, 0 } };
        int[][] ans = flipAndInvertImage(image);
        System.out.println(ans[0][1]);
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for (int row = 0; row < image.length; row++) {
            int start = 0;
            int end = image[row].length - 1;
            while (start < end) { // reversing the array
                int temp = image[row][start];
                image[row][start] = image[row][end];
                image[row][end] = temp;
                start++;
                end--;
            }

            for (int col = 0; col < image[row].length; col++) { // now inverting by making 0 to 1 and vicevaersa
                if (image[row][col] == 0) {
                    image[row][col] = 1;
                } else {
                    image[row][col] = 0;
                }
            }

        }
        return image;
    }

}
