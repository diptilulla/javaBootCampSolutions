import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length, i;
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        if (n < 3)
            return l;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int j = 0; j < n - 3; j++) {
            if (j > 0 && nums[j] == nums[j - 1])
                continue;
            for (i = j + 1; i < n - 2; i++) {
                if (i > j + 1 && nums[i] == nums[i - 1])
                    continue;
                int low = i + 1;
                int high = n - 1;
                int sum1 = nums[j] + nums[i];

                while (low < high) {
                    int sum2 = nums[low] + nums[high];
                    if (i == 1)
                        System.out.println(sum1 + sum2);
                    if (sum1 + sum2 > target)
                        high--;
                    else if (sum1 + sum2 < target)
                        low++;
                    else {
                        l.add(Arrays.asList(nums[j], nums[i], nums[low], nums[high]));
                        while (low > high - 1 && nums[low] == nums[low + 1])
                            low++;

                        while (high > low + 1 && nums[high] == nums[high - 1])
                            high--;
                        low++;
                        high--;
                    }
                }
            }
        }
        return l;
    }
}
