package problem1365;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main
{
    class Solution
    {
        public int[] smallerNumbersThanCurrent(int[] nums)
        {
            int[] smallerNumbers = new int[nums.length];

            for (int i = 0; i < nums.length; i++)
            {
                final int finalI = i;
                smallerNumbers[i] = (int) Arrays.stream(nums).filter(num -> num < nums[finalI]).count();
            }
            return smallerNumbers;
        }
    }

}
