package problem1913;

import java.util.*;

public class Solution
{
    // (a * b) - (c * d)
    public static void main(String[] args)
    {
        int[] arr = {4, 2, 2, 5, 5, 5, 4, 9, 7, 4, 8};
        System.out.println(new Solution().maxProductDifference(arr));
    }

    public int maxProductDifference(int[] nums)
    {
        Arrays.sort(nums);
        int a = nums[nums.length - 1];
        int b = nums[nums.length - 2];
        int c = nums[0];
        int d = nums[1];

        int product = (a * b) - (c * d);

        return product;
    }

}
