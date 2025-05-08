package TwoPointers;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {

        int l=0,r=0;int max=0,count=0;
        while (r<nums.length)
        {
            if(nums[r]==1)
            {
                count+=1;
                max=Math.max(count,max);
                ;
            }else {
                count=0;
                l=r+1;
            }r++;
        }return max;
    }

    public static void main(String[] args) {
        int arr[] = {0,0,0,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
