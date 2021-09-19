class MajorityElement {
    // using Moore's Voting Algorithm time-O(n), space=O(1)
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0, candidate = -1;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                candidate = nums[i];
                count++;
            } else {
                count += candidate == nums[i] ? 1 : -1;
            }
        }
        return candidate;
    }
}