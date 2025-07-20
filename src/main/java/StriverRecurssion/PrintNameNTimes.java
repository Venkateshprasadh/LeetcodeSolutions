package StriverRecurssion;

import java.util.Arrays;

public class PrintNameNTimes {

    public static void printName(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        printName(i+1,n);
        System.out.println(i);

    }

    public static int summatinon(int sum,int i,int n)
    {
        if(i>n)
        {
            return sum;
        }
        return summatinon(sum+i,i+1,n);
    }

    public static int summatinon2(int i)
    {
        if(i==0)
        {
            return 0;
        }
        return i+ summatinon2(i-1);
    }

    public static int fact1(int fact,int n)
    {
        if(n==0)
        {
            return fact;
        }
        return fact1(fact*n,n-1);
    }

    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*fact(n-1);
    }

    public static int[] reverseArray(int[] arr , int l,int r)
    {
        if(l>r)
        {
            return arr;
        }
        int temp = arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        return reverseArray(arr,l+1,r-1);
    }

    public static boolean isPalindrome(String s,int l ,int r)
    {
        if(l>r)
        {
            return true;
        }
        if(s.charAt(l)!=s.charAt(r))
        {
            return false;
        }
        return isPalindrome(s,l+1,r-1);
    }

    public static int  fib(int n)
    {
        if (n == 1) return 0;
        if (n == 2) return 1;
       /* if(n<=1)
        {
            return n;
        }*/
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
      //  printName(1,3);
      //  System.out.println(summatinon(0,1,3));
      // System.out.println(summatinon2(3));
      //  System.out.println(fact(2));
      //System.out.println(fact1(1,4));

     /*   int[] arr = {1,2,3,4,5,6};
        for (int i : (reverseArray(arr, 0, arr.length - 1))) {
            System.out.println(i);
        }*/
       /* String s ="madamk";
        System.out.println(isPalindrome(s,0,s.length()-1));*/

        System.out.println(fib(5));
        // 0 1 1 2 3 5
    }
}
