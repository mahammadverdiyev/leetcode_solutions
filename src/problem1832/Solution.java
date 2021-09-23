package problem1832;

import java.util.*;
import java.util.stream.Collectors;

public class Solution
{
    public static Set<Character> getAlphabetChars()
    {
        Set<Character> set = new HashSet<>(26);
        for (int i = 97; i <= 122; i++)
        {
            set.add((char) i);
        }
        return set;
    }

    public boolean checkIfPangram(String sentence)
    {
        Set<Character> alphabetChars = getAlphabetChars();
        List<Character> sentenceChars = sentence.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        sentenceChars.forEach(alphabetChars::remove);
        return alphabetChars.size() == 0;
    }
}
