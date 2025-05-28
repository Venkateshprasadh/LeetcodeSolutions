package TwoPointers;

import java.util.HashMap;

public class containsNearbyDuplicate {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(nums[0],0);
        for (int i=1;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                if(Math.abs(i-map.get(nums[i]))<=k)
                {
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3}; int k = 2;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
}
