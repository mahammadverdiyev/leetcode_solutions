package problem1816;

public class Main
{
    class Solution
    {
        public String truncateSentence(String s, int k)
        {
            StringBuilder sb = new StringBuilder();
            String[] words = s.split(" ");

            for(int i = 0; i < k; i++)
                sb.append(words[i]).append(" ");

            return sb.toString().trim();
        }
    }
}
