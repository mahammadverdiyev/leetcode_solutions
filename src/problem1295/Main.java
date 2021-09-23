package problem1295;

public class Main
{
    class Solution
    {
        public int findNumbers(int[] nums)
        {
            int numsWithEvenDigits = 0;

            for (int i = 0; i < nums.length; i++)
            {
                int value = nums[i];
                if (((int) Math.log10(value) + 1) % 2 == 0)
                    numsWithEvenDigits++;
            }
            return numsWithEvenDigits;
        }
    }
}
