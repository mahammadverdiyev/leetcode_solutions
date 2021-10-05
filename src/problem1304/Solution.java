package problem1304;

import java.util.HashSet;
import java.util.Map;
import java.util.Random;

public class Solution
{
    public int[] sumZero(int n) {
        if(n == 1)
            return new int[]{0};

        else if (n == 2)
            return new int[]{-1,1};

        int sum = 0;
        int[] result = new int[n];

        for(int i =0; i < n - 1; i++)
        {
            sum += i;
            result[i] = i;
        }

        result[result.length - 1] = -sum;

        return result;
    }
}
