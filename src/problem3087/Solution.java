package problem3087;

public class Solution
{
    public void reverseString(char[] s)
    {
        if (s.length != 1)
        {
            int n  = s.length;
            for (int i = 0; i < s.length / 2; i++)
            {
                char temp = s[i];
                s[i] = s[n - i - 1];
                s[n - i - 1] = temp;
            }
        }
    }
}
