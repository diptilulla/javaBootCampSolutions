class RelativeSorting {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] set = new int[1001];
        int i = 0, j = 0;
        for (int x : arr1) {
            set[x]++;
        }
        while (i < arr2.length) {
            if (set[arr2[i]] > 0) {
                arr1[j++] = arr2[i];
                set[arr2[i]]--;
            } else {
                i++;
            }
        }
        i = 0;
        while (i < 1001) {
            if (set[i] > 0) {
                arr1[j++] = i;
                set[i]--;
            } else {
                i++;
            }
        }
        return arr1;
    }
}