import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum0 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
            int l = i + 1;
            int h = n - 1;
            while (l < h) {
                int sum = nums[l] + nums[h];
                if (sum < nums[i] * -1)
                    l++;
                else if (sum > nums[i] * -1)
                    h--;
                else {
                    List<Integer> temp = Arrays.asList(nums[i], nums[l], nums[h]);
                    list.add(temp);
                    while (l < h - 1 && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    while (h > l + 1 && nums[h] == nums[h - 1]) {
                        h--;
                    }
                    l++;
                    h--;
                }
            }
        }
        return list;
    }
}
