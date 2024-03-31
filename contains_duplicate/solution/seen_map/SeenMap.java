package solution.seen_map;

import java.util.HashSet;
import java.util.Set;

public class SeenMap {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        boolean isDuplicate = containsDuplicate(new int[]{1, 2, 3, 4, 1});
        System.out.println(isDuplicate);
    }
}
