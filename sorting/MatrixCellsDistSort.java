import java.util.*;

public class MatrixCellsDistSort {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int res[][] = new int[rows * cols][2];
        TreeMap<Integer, ArrayList<int[]>> tm = new TreeMap<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int dist = Math.abs(i - rCenter) + Math.abs(cCenter - j);
                tm.putIfAbsent(dist, new ArrayList());
                tm.get(dist).add(new int[] { i, j });
            }
        }
        int k = 0;
        for (int x : tm.keySet()) {
            for (int[] arr : tm.get(x)) {
                res[k++] = arr;
            }
        }
        return res;
    }
}
