package problem2000;

public class Solution {
    public String reversePrefix(String word, char ch) {
        int indexFirstAppearance = word.indexOf(ch);

        String prefix = word.substring(0,indexFirstAppearance + 1);

        StringBuilder sb = new StringBuilder();

        sb.append(prefix).reverse().append(word.substring(indexFirstAppearance + 1));

        return sb.toString();
    }
}