package Learnings.DP_Recurssion_BackTracing;

public class ParameterisedFactorial {
    public static void main(String[] args) {
        factorial(5,1);
    }

    private static void factorial(int n, int fact) {
        if(n==1)
        {
            System.out.println(fact);
            return;
        }factorial(n-1,fact*n);

    }
}
