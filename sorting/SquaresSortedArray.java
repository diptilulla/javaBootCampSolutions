class SquaresSortedArray {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int n = nums.length;
        int h = n - 1;
        int k = n - 1;
        int[] res = new int[n];
        while (l <= h && k >= 0) {
            if (nums[l] * nums[l] >= nums[h] * nums[h]) {
                res[k--] = nums[l] * nums[l];
                l++;
            } else {
                res[k--] = nums[h] * nums[h];
                h--;
            }
        }
        return res;
    }
}