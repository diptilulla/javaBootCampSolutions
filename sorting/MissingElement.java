public class MissingElement {
    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void cyclicSort(int[] nums, int n) {
        int i = 0;
        while (i < n) {
            int correct = nums[i];
            if (nums[i] < n && nums[i] != nums[correct])
                swap(nums, i, correct);
            else
                i++;
        }
    }

    public int missingNumber(int[] nums) {
        int n = nums.length, i = 0;
        cyclicSort(nums, n);
        while (i < n) {
            if (i != nums[i]) {
                return i;
            }
            i++;
        }
        return n;
    }
}
