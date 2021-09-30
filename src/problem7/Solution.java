package problem7;

public class Solution
{
    public int reverse(int x) {
        boolean isNegative = x < 0;

        x = isNegative ? -x : x;

        String numberStr = Integer.toString(x);

        numberStr = new StringBuilder(numberStr).reverse().toString();

        try {
            x = Integer.parseInt(numberStr);
        }catch (Exception e){
            return 0;
        }

        x = isNegative ? -x : x;

        return x;
    }
}
