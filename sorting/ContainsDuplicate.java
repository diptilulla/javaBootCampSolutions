import java.util.*;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(nums[0], 0);
        for (int i = 1; i < n; i++) {
            if (hm.containsKey(nums[i]))
                return true;
            hm.put(nums[i], 0);
        }
        return false;
    }
}