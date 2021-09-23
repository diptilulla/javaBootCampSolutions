import java.util.Arrays;

class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int nearestDiff = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
            int l = i + 1;
            int h = n - 1;
            while (l < h) {
                int sum = nums[l] + nums[h];
                if (sum + nums[i] < target)
                    l++;
                else if (sum + nums[i] > target)
                    h--;
                else {
                    return target;
                }
                if (Math.abs(target - (sum + nums[i])) < nearestDiff) {
                    ans = sum + nums[i];
                    nearestDiff = Math.abs(target - (sum + nums[i]));
                }
            }
        }
        return ans;
    }
}
