package problem1309;

import java.util.*;

public class Solution
{

    static Map<String, String> map;

    public static void main(String[] args)
    {
    Solution s = new Solution();
    System.out.println(s.freqAlphabets("1326#"));
    }



    public void prepareDataForDecrypting(Map<String,String> map)
    {
        for(int i = 1; i  <= 9; i++)
            map.put(String.valueOf(i), String.valueOf((char)('a' + (i - 1))));

        for(int i = 10; i <= 26; i++)
        {
            String formattedKey = String.format("%d%s",i,"#");
            map.put(formattedKey,String.valueOf((char)('j' + (i - 10))));
        }
    }

    public String decryptText(String text)
    {
        StringBuilder sb =new StringBuilder();

        for(int i = 0; i < text.length(); i++)
        {
            char charAtText = text.charAt(i);
            String encryptedChar = String.valueOf(charAtText);
            String decryptedChar = map.get(encryptedChar);
            sb.append(decryptedChar);
        }

        return sb.toString();
    }


    public String decryptAccordingSharp(String text)
    {
        StringBuilder sb = new StringBuilder();
        if(text.length() == 2)
        {
            String formattedEncryptedKey = String.format("%s%s",text,"#");
            return map.get(formattedEncryptedKey);
        }
        else{
            String textSharpPart = text.substring(text.length() - 2);
            String textNoSharpPart = text.substring(0,text.length() - 2);

            for(int i = 0; i < textNoSharpPart.length(); i++)
            {
                char charAtNoSharpPart = textNoSharpPart.charAt(i);
                String encryptedChar = String.valueOf(charAtNoSharpPart);
                String decryptedChar = map.get(encryptedChar);
                sb.append(decryptedChar);
            }

            sb.append(map.get(textSharpPart + "#"));

            return sb.toString();
        }
    }

    public String decryptTextArray(String[] splitted)
    {
        StringBuilder sb =  new StringBuilder();

        for(int i = 0; i < splitted.length - 1; i++){
            String text = splitted[i];
            String decryptedText = decryptAccordingSharp(text);
            sb.append(decryptedText);
        }
        return sb.toString();
    }


    public String alterAccordingLastSharp(String originalText, String[] splitted, String decryptedSoFar) {
        String lastTextInArray = splitted[splitted.length - 1];
        if(originalText.endsWith("#")){
            return  decryptedSoFar + decryptAccordingSharp(lastTextInArray);
        }
        else {
            return  decryptedSoFar + decryptText(lastTextInArray);
        }
    }


    public String freqAlphabets(String s) {
        String[] splitted = s.split("#");
        map = new HashMap<>();
        String decryptedText = "";
        prepareDataForDecrypting(map);

        if(splitted.length == 1 && !s.contains("#"))
        {
             decryptedText = decryptText(s);
        }
        else if (splitted.length >= 1)
        {
            decryptedText = decryptTextArray(splitted);
            decryptedText = alterAccordingLastSharp(s,splitted,decryptedText);
        }

        return decryptedText;
    }
}
