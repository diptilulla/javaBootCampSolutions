import java.util.Arrays;

public class LargestPerimeter {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length - 1;
        while (l >= 2) {
            if (nums[l - 2] + nums[l - 1] > nums[l])
                return nums[l - 2] + nums[l - 1] + nums[l];
            else
                l--;
        }
        return 0;
    }
}
