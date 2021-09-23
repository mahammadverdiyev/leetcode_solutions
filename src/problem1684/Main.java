package problem1684;

import java.util.HashMap;
import java.util.Map;

public class Main
{
    class Solution
    {
        public int countConsistentStrings(String allowed, String[] words)
        {
            Map<Character, Boolean> allowedChars = new HashMap<>();

            for (int i = 0; i < allowed.length(); i++)
                allowedChars.put(allowed.charAt(i), true);

            int consistentStringCount = 0;

            for (int i = 0; i < words.length; i++)
            {
                boolean isConsistent = true;

                for (int j = 0; j < words[i].length(); j++)
                {
                    if (allowedChars.get(words[i].charAt(j)) == null)
                    {
                        isConsistent = false;
                        break;
                    }
                }
                if (isConsistent)
                    consistentStringCount++;
            }
            return consistentStringCount;
        }
    }
}
