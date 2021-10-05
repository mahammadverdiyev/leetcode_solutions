package problem804;
import java.util.*;

public class Solution {
    public void putMorseCode(Map<String, Integer> map, StringBuilder morseCodeBuilder)
    {
        String completedCode = morseCodeBuilder.toString();
        if(map.containsKey(morseCodeBuilder.toString()))
        {
            map.put(completedCode,map.get(completedCode) + 1);

        }else {
            map.put(completedCode,1);
        }
    }

    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<String,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < words.length; i++){
            String morseCode = "";

            for(int j = 0; j < words[i].length(); j++)
            {
                char currChar = words[i].charAt(j);
                int morseCodeIndex=  ((int) currChar) - 97;
                morseCode = morseCodes[morseCodeIndex];
                sb.append(morseCode);
            }
            putMorseCode(map,sb);
            sb.setLength(0);
        }
        return map.size();
    }

}