package Arrays;

public class spiralmatrix {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 } };

        int k = 0, l = 0;
        int m = a.length;
        int n = a[0].length;
        while (k < m && l < n) {
            // to print the first row
            for (int i = l; i < n; i++) {
                System.out.print(a[k][i] + " ");
            }
            k++;
            // to print the lasst column
            for (int i = k; i < m; i++) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;

            // now to print the last row we hav eto check whether it has other row or not by
            // checking k<m if k is less than m then we have last row
            if (k < m) {
                for (int i = n - 1; i >= l; i--) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }

            // now we have to go to first column
            // we should check it l<n
            if (l < n) {
                for (int i = m - 1; i >= k; i--) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }

    }

}
