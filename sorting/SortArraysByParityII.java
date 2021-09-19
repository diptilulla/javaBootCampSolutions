public class SortArraysByParityII {
    public void swap(int nums[], int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length, e = 0, o = 1;
        while (e < n && o < n) {
            if (nums[e] % 2 == 0)
                e += 2;
            if (nums[o] % 2 != 0)
                o += 2;
            else if (nums[e] % 2 != 0 && nums[o] % 2 == 0) {
                swap(nums, e, o);
                e += 2;
                o += 2;
            }
        }
        return nums;
    }
}
