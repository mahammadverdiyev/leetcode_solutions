package problem1773;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main
{
    class Solution
    {
        Map<String, Integer> rule = new HashMap<>();

        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue)
        {
            rule.put("type", 0);
            rule.put("color", 1);
            rule.put("name", 2);

            int matchedItemsCount = 0;

            for (List<String> item : items)
            {
                if (item.get(rule.get(ruleKey)).equals(ruleValue))
                {
                    matchedItemsCount++;
                }
            }
            return matchedItemsCount;
        }
    }
}
