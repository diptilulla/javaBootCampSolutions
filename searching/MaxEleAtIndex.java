//1 ms, faster than 100.00% O(logn) solution
class Solution {
    public long sum(long ele, long x) {
        return x * ele - (ele * (ele + 1)) / 2L;
    }

    public int maxValue(int n, int index, int maxSum) {
        maxSum -= n;
        long h = Integer.MAX_VALUE, l = 0, ans = 0;
        while (l <= h) {
            long mid = l + (h - l) / 2;
            long leftSum = sum(Math.min(index, mid - 1), mid);
            long rightSum = sum(Math.min((n - index - 1), mid - 1), mid);
            if (leftSum + rightSum + mid <= maxSum) {
                ans = Math.max(mid, ans);
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return (int) ans + 1;
    }
}