package Learnings.DP_Recurssion_BackTracing;

public class Fibonacii {

    public static void main(String[] args) {
        int n=5;
        int[] dp = new int[n+1];
        System.out.println(function(n,dp));
    }

    private static int function(int n, int[] dp) {
        if(n<=1)
        {
            return n;
        }
        if(dp[n]!=0)
        {
            return dp[n];
        }
        return dp[n]=function(n-1,dp)+function(n-2,dp);
    }
}
