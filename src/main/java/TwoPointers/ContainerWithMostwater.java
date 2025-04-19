package TwoPointers;

public class ContainerWithMostwater {

    private static int maxArea(int arr[])
    {
        int left=0,right=arr.length-1;
        int max = Integer.MIN_VALUE;
        while (left<=right)
        {
            int currMax= (right-left)*(Math.min(arr[left],arr[right]));
            max=Math.max(max,currMax);
            if(arr[left]<arr[right])
            {
                left++;
            }
            else {
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]= {1,1};
        System.out.println(maxArea(arr));
    }
}
