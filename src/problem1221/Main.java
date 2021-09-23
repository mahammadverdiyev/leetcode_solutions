package problem1221;

public class Main
{
    class Solution
    {
        public int balancedStringSplit(String s)
        {
            int L = 0, R = 0;
            int balanced = 0;

            for (int i = 0; i < s.length(); i++)
            {
                if (s.charAt(i) == 'R')
                    R++;
                else
                    L++;
                if (R == L)
                {
                    R = 0;
                    L = 0;
                    balanced++;
                }
            }
            balanced = balanced == 0 ? 1 : balanced;

            return balanced;
        }
    }
}
