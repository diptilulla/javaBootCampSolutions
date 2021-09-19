public class SortArrayParity {
    public void swap(int nums[], int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public int[] sortArrayByParity(int[] nums) {
        int l = 0, h = nums.length - 1;
        while (l < h) {
            if (nums[l] % 2 == 0)
                l++;
            if (nums[h] % 2 != 0)
                h--;
            else if (nums[l] % 2 != 0 && nums[h] % 2 == 0) {
                swap(nums, l, h);
                l++;
                h--;
            }
        }
        return nums;
    }
}
