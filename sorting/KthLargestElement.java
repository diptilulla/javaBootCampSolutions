public class KthLargestElement {

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public int partition(int[] nums, int s, int e) {
        int pivot = nums[e];
        int pivotIndex = s;
        int i = s;
        for (; i < e; i++) {
            if (nums[i] <= pivot) {
                swap(nums, pivotIndex, i);
                pivotIndex++;
            }
        }
        swap(nums, e, pivotIndex);
        return pivotIndex;
    }

    public int quickSelect(int[] nums, int s, int e, int k) {
        int index = partition(nums, s, e);
        if (index == nums.length - k)
            return nums[index];
        else if (index < nums.length - k)
            return quickSelect(nums, index + 1, e, k);
        else
            return quickSelect(nums, s, index - 1, k);
    }

    public int findKthLargest(int[] nums, int k) {
        int s = 0, e = nums.length - 1;
        return quickSelect(nums, s, e, k);
    }

}
