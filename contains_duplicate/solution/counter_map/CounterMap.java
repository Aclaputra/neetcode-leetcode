package solution.counter_map;
import java.util.HashMap;
import java.util.Map;

class CounterMap {
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            counter.put(nums[i], counter.getOrDefault(nums[i], 0) + 1);
            if (counter.get(nums[i]) > 1) {
                return true;
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        boolean isDuplicate = containsDuplicate(new int[]{1,2,3,1});
        System.out.println(isDuplicate);
    }
}