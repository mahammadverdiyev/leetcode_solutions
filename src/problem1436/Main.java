package problem1436;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main
{
    class Solution
    {
        public String destCity(List<List<String>> paths)
        {
            Map<String, String> pathMap = new HashMap<>();

            for (List<String> path : paths)
                pathMap.put(path.get(0), path.get(1));

            String destinationCity = paths.get(0).get(1);
            String key = paths.get(0).get(0);

            while (true)
            {
                destinationCity = pathMap.get(key);
                if (destinationCity != null)
                    key = destinationCity;
                else
                {
                    destinationCity = key;
                    break;
                }
            }

            return destinationCity;
        }
    }
}
