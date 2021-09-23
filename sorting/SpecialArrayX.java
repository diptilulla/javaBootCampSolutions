import java.util.Arrays;

public class SpecialArrayX {
    // binary search
    public int binSearch(int[] nums, int n) {
        int l = 0, h = n - 1;
        while (l <= h) {
            int m = l + (h - l) / 2, count = check(m, nums);
            if (count == m)
                return m;
            else if (count > m) {
                l = m + 1;
            } else
                h = m - 1;
        }
        return -1;
    }

    public int check(int x, int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (x <= nums[i]) {
                count++;
            }
        }
        return count;
    }

    public int specialArray(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if (nums[0] >= n)
            return n;
        return binSearch(nums, n);
    }

    // set array
    public int specialArrayII(int[] nums) {
        int n = nums.length;
        int[] set = new int[1001];
        for (int i = 0; i < n; i++) {
            set[nums[i]]++;
        }
        for (int i = 999; i >= 0; i--) {
            set[i] += set[i + 1];
        }
        for (int i = 0; i < 1001; i++) {
            if (i == set[i])
                return i;
        }
        return -1;
    }
}
