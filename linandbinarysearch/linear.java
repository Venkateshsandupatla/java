package linandbinarysearch;

public class linear {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int ans = linear(arr, 3);
        System.out.println(ans);
    }

    static int linear(int[] arr, int target) {
        for (int i : arr) {

            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
