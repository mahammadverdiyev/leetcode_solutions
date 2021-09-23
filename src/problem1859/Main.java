package problem1859;

import java.util.Observable;

public class Main
{
    class Solution
    {
        public String sortSentence(String s)
        {
            String[] wordArray = s.split(" ");
            int wordCount = wordArray.length;

            String[] words = new String[wordCount];

            for (int i = 0; i < wordArray.length; i++)
            {
                int index = Character.getNumericValue(wordArray[i].charAt(wordArray[i].length() - 1)) - 1;
                words[index] = wordArray[i].substring(0, wordArray[i].length() - 1);
            }

            return String.join(" ", words);
        }
    }
}
