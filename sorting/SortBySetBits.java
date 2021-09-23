import java.util.TreeMap;
import java.util.Arrays;
import java.util.ArrayList;

class SortBySetBits {
    public int[] sortByBits(int[] arr) {
        int n = arr.length, k = 0;
        Arrays.sort(arr);
        TreeMap<Integer, ArrayList<Integer>> m = new TreeMap<>();
        for (int j = 0; j < n; j++) {
            int count = 0;
            int t = arr[j];
            while (t > 0) {
                count += 1 & t;
                t >>= 1;
            }
            m.putIfAbsent(count, new ArrayList());
            m.get(count).add(arr[j]);
        }
        for (int i : m.keySet()) {
            for (int a : m.get(i))
                arr[k++] = a;
        }
        return arr;
    }
}