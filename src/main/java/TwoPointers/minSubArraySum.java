package TwoPointers;

public class minSubArraySum {

    public static int minSubArrayLen(int target, int[] nums) {

        int sum=0,l=0,r=0,minlength=Integer.MAX_VALUE;

        while (r<nums.length)
        {
            sum=sum+nums[r];

            while(sum>=target)
            {
                minlength=Math.min(minlength,r-l+1);
                sum=sum-nums[l];
                l++;
            }

            r++;

        }
        return minlength==Integer.MAX_VALUE?0:minlength;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target,arr));
    }

}