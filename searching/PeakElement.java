public class PeakElement {
    public int findPeakElement(int[] nums) {
        int n = nums.length, l = 0, h = n - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if ((mid == n - 1 || nums[mid] > nums[mid + 1]) && (mid == 0 || nums[mid] > nums[mid - 1]))
                return mid;
            else if (mid < n - 1 && nums[mid] < nums[mid + 1])
                l = mid + 1;
            else
                h = mid - 1;
        }
        throw new IllegalArgumentException("not found");
    }
}
