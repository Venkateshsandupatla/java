package Arrays;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/add-to-array-form-of-integer/

//     The array-form of an integer num is an array representing its digits in left to right order.

// For example,for num=1321,the array form is[1,3,2,1].
// Given num,the array-form of an integer,and an integer k,return the array-form of the integer num+k.

// Example 1:

// Input:num=[1,2,0,0],k=34 Output:[1,2,3,4]Explanation:1200+34=1234 Example 2:

// Input:num=[2,7,4],k=181 Output:[4,5,5]Explanation:274+181=455 Example 3:

// Input:num=[2,1,5],k=806 Output:[1,0,2,1]Explanation:215+806=1021

// Constraints:

// 1<=num.length<=104 0<=num[i]<=9 num does not contain any leading zeros except for the zero itself.1<=k<=104
public class addtoarrayformofinteger {
    public static void main(String[] args) {
        int[] num = { 1, 2, 0, 0 };
        int k = 31;
        List<Integer> ans = addToArrayForm(num, k);
        System.out.println(ans);

    }
    // answer: Let's add numbers in a schoolbook way, column by column. For example,
    // to add 123 and 912, we add 3+2, then 2+1, then 1+9. Whenever our addition
    // result is more than 10, we carry the 1 into the next column. The result is
    // 1035.
    // We can do a variant of the above idea that is easier to implement - we put
    // the entire addend in the first column from the right.

    // Continuing the example of 123 + 912, we start with [1, 2, 3+912]. Then we
    // perform the addition 3+912, leaving 915. The 5 stays as the digit, while we
    // 'carry' 910 into the next column which becomes 91.

    // We repeat this process with [1, 2+91, 5]. We have 93, where 3 stays and 90 is
    // carried over as 9. Again, we have [1+9, 3, 5] which transforms into [1, 0, 3,
    // 5].
    static List<Integer> addToArrayForm(int[] num, int k) {
        int i = num.length - 1;
        List<Integer> ans = new ArrayList<>();
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k = k + num[i];
            }
            ans.add(k % 10);
            k = k / 10;
            i--;

        }
        int st = 0;
        int end = ans.size() - 1;
        while (st < end) {
            int temp = ans.get(st);
            ans.set(st, ans.get(end));
            ans.set(end, temp);
            st++;
            end--;
        }
        return ans;
    }
}
