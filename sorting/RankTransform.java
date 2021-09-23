import java.util.TreeSet;
import java.util.HashMap;
import java.util.Arrays;

class RankTransform {
    // Array solution
    public int[] arrayRankTransformI(int[] arr) {
        int rank = 1;
        int[] temp = arr.clone();
        Arrays.sort(temp);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hm.containsKey(temp[i])) {
                hm.put(temp[i], rank++);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = hm.get(arr[i]);
        }
        return arr;
    }

    // TreeSet sol
    public int[] arrayRankTransformII(int[] arr) {
        int rank = 1;
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i : arr)
            ts.add(i);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : ts)
            hm.put(i, rank++);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = hm.get(arr[i]);
        }
        return arr;
    }
}
