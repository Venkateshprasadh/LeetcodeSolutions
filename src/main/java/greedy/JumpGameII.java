package greedy;

public class JumpGameII {
    public static int jump(int[] nums) {
    int count=0,maxleng=0;
    int end=0;
    for(int i=0;i<nums.length-1;i++)
    {

        maxleng=Math.max(i+nums[i],maxleng);
        if(i==end)
        {
            count+=1;
            end=maxleng;
        }
    }
    return count;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jump(nums));
    }
}
