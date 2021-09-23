package problem1588;


import java.util.Arrays;

public class Main
{
    class Solution
    {
        public int sumOddLengthSubarrays(int[] arr)
        {
            int sum = 0;
            sum = Arrays.stream(arr).sum();

            if (arr.length % 2 != 0 && arr.length != 1)
                sum *= 2;

            int subArrayLength = 3;

            while (subArrayLength < arr.length)
            {
                for (int i = 0; i <= arr.length - subArrayLength; i++)
                {
                    int temp = i + subArrayLength;
                    for (int j = i; j < temp; j++)
                    {
                        sum += arr[j];
                    }
                }
                subArrayLength += 2;
            }

            return sum;
        }
    }
}
