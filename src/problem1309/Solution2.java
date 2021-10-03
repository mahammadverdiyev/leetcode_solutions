package problem1309;
import java.util.*;

public class Solution2
{
    public String decryptText(String text)
    {
        StringBuilder decryptedTextBuilder = new StringBuilder();

        for(int i = 0; i < text.length();)
        {
            int nextSecondIndex = i + 2;
            if(nextSecondIndex < text.length()){
                if(text.charAt(nextSecondIndex) == '#')
                {
                    char decryptedValue = (char)(Integer.parseInt(text.substring(i, i+2)) + 96);
                    decryptedTextBuilder.append(decryptedValue);
                    i += 3;
                }
                else {
                        decryptedTextBuilder.append((char)(Character.getNumericValue(text.charAt(i)) + 96));
                        i += 1;
                }
            }
            else{
                decryptedTextBuilder.append((char)(Character.getNumericValue(text.charAt(i)) + 96));
                i += 1;
            }
        }

        return decryptedTextBuilder.toString();
    }

    public String freqAlphabets(String s) {
        String decryptedText = "";
        decryptedText = decryptText(s);

        return decryptedText;
    }
}
