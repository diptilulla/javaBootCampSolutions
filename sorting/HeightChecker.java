class HeightChecker {
    // count sort approach
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] temps = new int[101];
        for (int i : heights) {
            temps[i]++;
        }
        for (int i = 1; i < 101; i++) {
            temps[i] += temps[i - 1];
        }
        for (int i = 0; i < heights.length; i++) {
            if (i > temps[heights[i]] - 1 || (heights[i] > 1 && i < temps[heights[i] - 1]))
                count++;
        }
        return count;
    }
}