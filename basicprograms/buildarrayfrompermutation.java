package basicprograms;

// q: https://leetcode.com/problems/build-array-from-permutation/
import java.util.ArrayList;
import java.util.Arrays;

public class buildarrayfrompermutation {
    public static void main(String[] args) {
        int[] num = { 0, 2, 1, 5, 3, 4 };
        // System.out.println(buildarray(num));
        int[] answe = b(num);
        System.out.println(Arrays.toString(answe));
    }

    static ArrayList<Integer> buildarray(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>(10);
        for (int i = 0; i < nums.length; i++) {
            ans.add(nums[nums[i]]);
        }
        return ans;
    }

    static int[] b(int[] nums) {
        int[] an = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            an[i] = nums[nums[i]];
        }
        return an;
    }
}
