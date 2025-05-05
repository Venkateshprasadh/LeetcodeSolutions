package Contest;

public class MinimumOperationstoMakeArraySumDivisiblebyK {

    public static int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        if(sum<k)
        {
            return sum;
        }
        int count=0;
        while (sum%k!=0)
        {
            sum=sum-1;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
    int[] arr = {3,2};
    System.out.println(minOperations(arr,6));
    }
}
