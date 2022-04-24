package twodarraysearch;

public class search2darray {

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 9, 3 },

                { 5, 0, 8 }
        };

        int target = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
