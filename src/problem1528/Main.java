package problem1528;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    class Solution
    {
        public String restoreString(String s, int[] indices)
        {
            String[] charSequence = new String[indices.length];

            for (int i = 0; i < s.length(); i++)
            {
                charSequence[indices[i]] = String.valueOf(s.charAt(i));
            }

            return String.join("", charSequence);
        }
    }
}
