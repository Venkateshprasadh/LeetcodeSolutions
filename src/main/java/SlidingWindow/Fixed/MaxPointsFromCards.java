package SlidingWindow.Fixed;

public class MaxPointsFromCards {

    public static int maxScore(int[] arr, int k) {

        int lsum=0;
        for(int i=0;i<=k-1;i++)
        {
            lsum=lsum+arr[i];
        }int maxsum=lsum,r=arr.length-1,rsum=0;
        for(int i=k-1;i>=0;i--)
        {
            lsum=lsum-arr[i];
            rsum= rsum+arr[r];
            maxsum=Math.max(maxsum,(lsum+rsum));
            r--;
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] arr = {9,7,7,9,7,7,9}; int target=7;
        System.out.println(maxScore(arr,target));
    }
}
