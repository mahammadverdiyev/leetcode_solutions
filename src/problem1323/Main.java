package problem1323;

public class Main
{
    class Solution
    {
        public int maximum69Number(int num)
        {
            char[] digitChars = Integer.toString(num).toCharArray();

            for (int i = 0; i < digitChars.length; i++)
            {
                if (digitChars[i] == '6')
                {
                    digitChars[i] = '9';
                    break;
                }
            }
            return Integer.parseInt(String.valueOf(digitChars));
        }
    }
}
