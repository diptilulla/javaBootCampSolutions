import java.util.*;

public class IntersectionArrays {
    public int binSearch(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] > target)
                h = mid - 1;
            else if (nums[mid] == target)
                return mid;
            else
                l = mid + 1;
        }
        return -1;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i : nums1) {
            h.put(i, 1);
        }
        for (int i : nums2) {
            if (h.containsKey(i))
                h.replace(i, h.get(i) + 1);
        }
        Set<Integer> hs = new HashSet<>(h.keySet());
        for (Integer e : hs)
            if (h.get(e) == 1)
                h.remove(e);
        int arr[] = new int[h.size()];

        int j = 0;

        for (Map.Entry<Integer, Integer> e : h.entrySet()) {
            arr[j++] = e.getKey();
        }
        return arr;

    }
    // binary search approach
    // public int[] intersection(int[] nums1, int[] nums2) {
    // int n1=nums1.length, n2=nums2.length;

    // HashSet<Integer> h = new HashSet<>();
    // if(n1<=n2)
    // {
    // Arrays.sort(nums1);
    // for(int i=0;i<n2;i++)
    // {
    // int index = binSearch(nums1, nums2[i]);
    // if(index>=0)
    // h.add(nums1[index]);
    // }
    // }
    // else
    // {
    // Arrays.sort(nums2);
    // for(int i=0;i<n1;i++)
    // {
    // int index = binSearch(nums2, nums1[i]);
    // System.out.println(index);
    // if(index>=0)
    // h.add(nums2[index]);
    // }
    // }
    // int arr[] = new int[h.size()];

    // int j=0;

    // for(Integer ele:h){
    // arr[j++] = ele;
    // }
    // return arr;
    // }
}
