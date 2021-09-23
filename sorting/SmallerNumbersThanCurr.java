class SmallerNumbersThanCurr {
    // count sort approach
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int i, n = nums.length;
        int count[] = new int[101];
        for (int x : nums) {
            count[x]++;
        }

        for (i = 1; i < 101; i++) {
            count[i] += count[i - 1];
        }
        for (i = 0; i < n; i++) {
            if (nums[i] != 0)
                nums[i] = count[nums[i] - 1];
        }
        return nums;
    }
}
