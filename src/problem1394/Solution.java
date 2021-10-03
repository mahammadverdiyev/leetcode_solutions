package problem1394;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.WeakHashMap;

public class Solution
{
    public int findLucky(int[] arr)
    {
        Map<Integer, Integer> map = new HashMap<>();

        int luckyIntegerCount = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (!map.containsKey(arr[i]))
            {
                map.put(arr[i], 1);
            } else
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        LinkedList<Integer> luckyIntegers = new LinkedList<>();

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getKey().equals(entry.getValue()))
            {
                luckyIntegerCount++;
                luckyIntegers.add(entry.getKey());
            }
        }

        if(luckyIntegerCount == 0)return -1;

        else if(luckyIntegerCount == 1) return luckyIntegers.getFirst();

        else {
            int largest = -1;
            for(Integer luckyInt : luckyIntegers)
            {
                largest = Math.max(largest,luckyInt);
            }
            return largest;
        }
    }
}
