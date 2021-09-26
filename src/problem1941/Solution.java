package problem1941;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution
{
    public boolean areOccurrencesEqual(String s)
    {
        Map<Character, Integer> charContainer = new HashMap<>();

        s.chars().mapToObj(val -> (Character) ((char) val)).forEach(ch ->
        {
            if (!charContainer.containsKey(ch))
            {
                charContainer.put(ch, 0);
            } else
            {
                charContainer.put(ch, charContainer.get(ch) + 1);
            }
        });

        boolean isGood = true;


        Object[] values = charContainer.values().toArray();

        int prevVal = (Integer) values[0];

        for(int i = 1; i < values.length; i++){
            int currentVal = (Integer)values[i];

            if(currentVal != prevVal) {
                isGood = false;
                break;
            }
        }

        return isGood;
    }
}
