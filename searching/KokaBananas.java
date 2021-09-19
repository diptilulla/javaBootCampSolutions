class KokaBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for (int i : piles) {
            if (i > max)
                max = i;
        }
        int ans = max, e = max, s = 1;
        while (s <= e) {
            int m = s + (e - s) / 2, count = 0;
            for (int i : piles)
                count += (int) Math.ceil((double) i / m);
            if (count <= h) {
                ans = Math.min(m, ans);
                e = m - 1;
            } else
                s = m + 1;
        }
        return ans;
    }
}
