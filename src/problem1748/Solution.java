package problem1748;

import java.util.stream.IntStream;

public class Solution
{
    public int sumOfUnique(int[] nums) {
        int[] elementCounts = new int[101];

        for (int num : nums)
        {
            elementCounts[num]++;
        }

        int sum = 0;

        for (int i = 0; i < 101; i++)
        {
            if(elementCounts[i] == 1)
                sum += i;
        }

        return sum;
    }
}
