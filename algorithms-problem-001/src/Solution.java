import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> numbersToIndexies = new HashMap<>();

        for (int i = 0; i < numbers.length; ++i) {
            int addent = target - numbers[i];
            if (numbersToIndexies.containsKey(addent)) {
                return new int[] {numbersToIndexies.get(addent), i};
            } else {
                numbersToIndexies.put(numbers[i], i);
            }
        }

        return new int[0];
    }
}