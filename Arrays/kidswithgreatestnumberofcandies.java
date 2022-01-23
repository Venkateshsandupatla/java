package Arrays;

import java.util.Arrays;

// Q: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class kidswithgreatestnumberofcandies {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        int max = 0;
        Boolean[] ans = new Boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                ans[i] = true;

            } else {
                ans[i] = false;

            }

        }
        System.out.println(Arrays.asList(ans));

    }
}
