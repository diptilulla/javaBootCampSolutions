import java.util.*;

class MinAbsDiff {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(arr);
        int min = Math.abs(arr[1] - arr[0]);
        for (int i = 1; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i + 1] - arr[i]);
            if (diff < min)
                min = diff;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff == min) {
                List<Integer> list = Arrays.asList(arr[i], arr[i + 1]);
                result.add(list);
            }
        }
        return result;
    }
}