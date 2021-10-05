package problem1051;

import java.util.Arrays;

public class Solution
{
    public int heightChecker(int[] heights) {
        int[] expectedHeights = heights.clone();
        Arrays.sort(expectedHeights);

        int notMatchedCounter = 0;

        for(int i = 0; i < heights.length; i++)
        {
            if(expectedHeights[i] != heights[i])
                notMatchedCounter++;
        }

        return notMatchedCounter;
    }
}
