public class ThirdMaximum {
    // public int thirdMax(int[] nums) {
    // Arrays.sort(nums);
    // int n=nums.length, pos=1;
    // for(int i=n-2; i>=0; i--)
    // {
    // if(nums[i]!=nums[i+1])
    // pos++;
    // if(pos==3)
    // return nums[i];
    // }
    // return nums[n-1];
    // }
    public int thirdMax(int[] nums) { // O(n)
        int n = nums.length, i = 0;
        int max1 = 0, max2 = -1, max3 = -1;
        for (i = 1; i < n; i++) {
            if (nums[i] > nums[max1]) {
                max3 = max2;
                max2 = max1;
                max1 = i;
                System.out.println(max2);

            } else if ((nums[i] < nums[max1]) && (max2 == -1 || nums[i] > nums[max2])) {
                max3 = max2;
                max2 = i;
            }

            else if (max2 > -1 && nums[i] < nums[max2] && (max3 == -1 || nums[i] > nums[max3])) {
                max3 = i;
            }
        }
        return (max3 > -1) ? nums[max3] : nums[max1];
    }
}
