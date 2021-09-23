package problem1688;

public class Main
{
    class Solution
    {
        public int numberOfMatches(int n)
        {
            int playedMatches = 0;

            while (n != 1)
            {
                if (n % 2 == 0)
                {
                    n /= 2;
                    playedMatches += n;
                } else
                {
                    playedMatches += (n - 1) / 2;
                    n = (n - 1) / 2 + 1;
                }
            }
            return playedMatches;
        }
    }
}
