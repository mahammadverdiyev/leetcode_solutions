package problem1389;

import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    class Solution
    {
        int[] output;

        public void insert(int index, int element)
        {
            if (output.length - 1 - index >= 0)
                System.arraycopy(output, index, output, index + 1, output.length - 1 - index);
            output[index] = element;
        }

        public int[] createTargetArray(int[] nums, int[] index)
        {
            output = new int[nums.length];

            for (int i = 0; i < nums.length; i++)
            {
                insert(index[i], nums[i]);
            }

            return output;
        }
    }

    public static void main(String[] args)
    {

    }
}
