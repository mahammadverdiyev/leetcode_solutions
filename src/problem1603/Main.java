package problem1603;

import java.util.HashMap;
import java.util.Map;

public class Main
{
    class ParkingSystem
    {
        Map<Integer, Integer> slots;

        public ParkingSystem(int big, int medium, int small)
        {
            slots = new HashMap<>();
            slots.put(1, big);
            slots.put(2, medium);
            slots.put(3, small);
        }

        public boolean addCar(int carType)
        {
            if (slots.get(carType) > 0)
            {
                slots.put(carType, slots.get(carType) - 1);
                return true;
            }
            return false;
        }
    }

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */

}
