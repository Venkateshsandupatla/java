package Arrays;

public class array2d {
    public static void main(String[] args) {
        // 2d array is a matrix form
        // its a array of arrays
        // // 1 2 3
        // 4 5 6
        // 7 8 9
        int[][] arr2d = new int[3][]; // we should define the number of rows but no need to define thhe number of
                                      // columns because in one row it can have 3 column elements and in other row it
                                      // can have 5 elements too

        int[][] arr2 = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int[][] ar23 = {
                { 1, 2, 3 },
                { 4, 5, 6, 7, 8 }, // we can have differnet columm lengths
                { 9, 0 }
        };

    }
}
