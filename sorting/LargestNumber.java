import java.util.*;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];
        int n = nums.length;
        boolean allZero = true;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0)
                allZero = false;
            strNums[i] = Integer.toString(nums[i]);
        }
        if (allZero)
            return "0";
        Arrays.sort(strNums, (a, b) -> {
            long num1 = Long.parseLong(a + b);
            long num2 = Long.parseLong(b + a);
            return -Long.compare(num1, num2);
        });
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            res.append(strNums[i]);
        }
        return res.toString();
    }
}
