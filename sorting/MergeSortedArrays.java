class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // similar to merge sort, keeping two pointers i & j at last indices of nums1
        // and nums2 resp, start inserting larger ele out of nums1[i] and nums2[j] at
        // the end of nums1 O(m+n)
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (j >= 0 && i >= 0) {
            if (nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];

            else if (nums2[j] >= nums1[i])
                nums1[k--] = nums2[j--];
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}