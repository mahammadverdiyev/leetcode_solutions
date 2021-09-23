package problem1678;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main
{
    class Solution
    {
        public String interpret(String command)
        {
            Map<String, String> alphabet = new HashMap<>();
            alphabet.put("G", "G");
            alphabet.put("()", "o");
            alphabet.put("(al)", "al");

            StringBuilder sb = new StringBuilder();
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < command.length(); i++)
            {
                sb.append(command.charAt(i));
                if (alphabet.containsKey(sb.toString()))
                {
                    result.append(alphabet.get(sb.toString()));
                    sb.setLength(0);
                }
            }
            return result.toString();
        }
    }
}
