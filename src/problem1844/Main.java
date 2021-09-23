package problem1844;

public class Main
{
    class Solution
    {
        public String replaceDigits(String s)
        {
            char[] chars = s.toCharArray();

            int len = chars.length % 2 == 0 ? chars.length : chars.length - 1;

            for (int i = 0; i < len; i += 2)
            {
                chars[i + 1] = (char) (chars[i] + Character.getNumericValue(chars[i + 1]));
            }

            return String.valueOf(chars);
        }
    }
}
