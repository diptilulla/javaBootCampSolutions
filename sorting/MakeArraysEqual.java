public class MakeArraysEqual {
    public boolean canBeEqual(int[] target, int[] arr) {
        int n = arr.length;
        int set[] = new int[1001];
        for (int i = 0; i < n; i++) {
            set[target[i]]++;
            set[arr[i]]--;
        }
        for (int j = 0; j < 1001; j++) {
            if (set[j] != 0)
                return false;
        }
        return true;
    }
}
