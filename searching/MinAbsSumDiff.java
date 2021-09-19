import java.util.Arrays;

class MinAbsSumDiff {
    public int binSearch(int[] nums1, int k, int n)
    {
        int l=0, h=n-1;
        while(l<=h)
        {
            int m=l+(h-l)/2;
            if(nums1[m]==k)
                return m;
            else if(nums1[m]<k)
                l=m+1;
            else
                h=m-1;
        }
        return l;
    }
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int i, n = nums1.length;
        long ans=0;
        for(i=0; i<n; i++)
        {
            int diff = Math.abs(nums2[i]-nums1[i]);
            ans+= diff;
        }
        int[] temp = nums1.clone();
        Arrays.sort(temp);
        long newAns = ans;
        for(i=0; i<n; i++)
        {
            int index=binSearch(temp, nums2[i], n);
            int leftIndex = index==0 ? index:index-1;
            int rightIndex = index==n?index-1:index; //i.e element's insert pos is between leftIndex and rightIndex
            int diff = Math.min(Math.abs(temp[leftIndex]-nums2[i]), Math.abs(temp[rightIndex]-nums2[i]));
            long tempAns = ans- Math.abs(nums2[i]-nums1[i])+ diff;
            if(newAns>tempAns)
            {
                newAns=tempAns;
            }
        }
        return (int)(newAns%1000000007);
    }
}