package problem1313;

import java.util.LinkedList;
import java.util.List;

public class Main
{
    class Solution
    {
        public int[] decompressRLElist(int[] nums)
        {
            List<Integer> output = new LinkedList<>();

            for (int i = 0; i < nums.length; i += 2)
            {
                for (int j = 0; j < nums[i]; j++)
                {
                    output.add(nums[i + 1]);
                }
            }

            int[] result = new int[output.size()];
            int index = 0;
            for (int element : output)
            {
                result[index] = element;
                index++;
            }
            return result;
        }
    }
}
