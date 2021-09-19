class CapacityToShip {
    public int shipWithinDays(int[] weights, int days) {
        // range problem range of capacity is [max wt, sum of all wts]
        int n = weights.length, max = 0, sum = 0, ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(weights[i], max);
            sum += weights[i];
        }
        int l = max, h = sum;
        while (l <= h) {
            int m = l + (h - l) / 2;
            int currDays = 1, currSum = 0;
            for (int i = 0; i < n; i++) {
                currSum += weights[i];
                if (currSum > m) {
                    currDays++;
                    currSum = weights[i];
                }
            }

            if (currDays > days)
                l = m + 1;
            else {
                ans = Math.min(ans, m);
                h = m - 1;
            }
        }
        return ans;
    }
}