package problem1441;

import java.util.*;

public class Solution {
    public List<String> buildArray(int[] target, int n) {
        int tracker = 1;
        List<String> output = new LinkedList<>();

        for (int i = 0; i < target.length; i++, tracker++) {

            if ((target.length - 1) < i) break;

            if (target[i] != tracker) {
                output.add("Push");
                output.add("Pop");
                i--;
            } else {
                output.add("Push");
            }
        }

        return output;
    }
}
