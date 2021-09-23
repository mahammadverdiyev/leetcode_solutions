package problem1281;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main
{
    class Solution
    {
        public int subtractProductAndSum(int n)
        {
            int product = 1;
            int sum = 0;

            String[] splitted = String.valueOf(n).split("");

            Supplier<IntStream> streamSupplier = () ->
                    Arrays.stream(splitted)
                            .mapToInt(Integer::parseInt);

            product = streamSupplier.get().reduce(1, (a, b) -> a * b);
            sum = streamSupplier.get().sum();

            return product - sum;
        }
    }
}
