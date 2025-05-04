package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MincostClimbingStairs {
    private static int function(int[] arr,int index,int n,int[] dp)
    {
        if(index>=n)
        {
            return 0;
        }
        if(dp[index]!=-1)
        {
            return dp[index];
        }
        int lsum = arr[index]+function(arr,index+1,n,dp);
        int rsum = arr[index]+function(arr,index+2,n,dp);
        return dp[index]=Math.min(lsum,rsum);
    }
    public static void main(String[] args) {
        int arr[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] dp = new int[arr.length+1];
        Arrays.fill(dp,-1);
        System.out.println(Math.min(function(arr,0,arr.length,dp),function(arr,1,arr.length,dp)));
    }
}




