class SortColors {

    public void sortColors(int[] nums) {
        int n = nums.length;
        int zeroCount = 0, oneCount = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                zeroCount++;
            else if (nums[i] == 1)
                oneCount++;
        }
        int k = 0;
        while (zeroCount > 0) {
            nums[k++] = 0;
            zeroCount--;
        }
        while (oneCount > 0) {
            nums[k++] = 1;
            oneCount--;
        }
        while (k < n) {
            nums[k++] = 2;
        }
    }

    static void sort012(int a[], int arr_size) {
        int lo = 0;
        int hi = arr_size - 1;
        int mid = 0, temp = 0;
        while (mid <= hi) {
            switch (a[mid]) {
                case 0: {
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
    }
}
