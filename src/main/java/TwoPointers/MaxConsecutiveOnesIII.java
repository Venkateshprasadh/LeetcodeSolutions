package TwoPointers;

public class MaxConsecutiveOnesIII {
    public static int longestOnes(int[] nums, int k) {
    int l=0,r=0,zerosCount=0,max=0;
    while (r<nums.length)
    {
        if(nums[r]==0)
        {
            zerosCount++;
        }
        if(zerosCount>k)
        {
            if(nums[l]==0)
            {
                zerosCount--;
            }l++;
        }
        if(zerosCount<=k) {
            max=Math.max(max,r-l+1);
        }r++;
    }



    return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0}; int k=2;
        System.out.println(longestOnes(arr,k));
    }
}
