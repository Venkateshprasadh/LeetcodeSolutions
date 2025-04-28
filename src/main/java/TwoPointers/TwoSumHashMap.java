package TwoPointers;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumHashMap {

    private static int[] twosum(int[] arr, int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int complement = target- arr[i];
            if(map.containsKey(complement))
            {
                return new int[]{map.get(complement),i};
            }
            else {
                map.put(arr[i],i);
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15}; int target = 18;
        Arrays.stream(twosum(arr,target)).forEach(System.out::println);
        
    }
}
