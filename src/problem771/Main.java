package problem771;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
    class Solution
    {
        public int numJewelsInStones(String jewels, String stones)
        {
            List<String> _jewels = Arrays.stream(jewels.split(""))
                    .collect(Collectors.toList());

            int counter = 0;

            for (char ch : stones.toCharArray())
            {
                counter = _jewels.contains(Character.toString(ch)) ? ++counter : counter;
            }
            return counter;
        }
    }
}
