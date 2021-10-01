class Solution {
    public int[] runningSum(int[] nums) {
        int l=nums.length;
        int[] ans=new int[l];
        int sum=0;
        for(int i=0;i<l;i++){
            sum+=nums[i];
            ans[i]=sum;
        }
        return ans;
    }
}
