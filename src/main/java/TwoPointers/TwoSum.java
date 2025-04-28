package TwoPointers;

public class TwoSum {

private static int[] sumIndexes(int arr[], int target)
{
    int left=0,right=arr.length-1;

    while (left<=right)
    {
        int sum =arr[left]+arr[right];
        if(sum==target)
        {
            return new int[]{left+1,right+1};
        }
        if(sum<target){
            left++;
        }else {
            right--;
        }

    }
    return new int[]{-1,-1};
}

    public static void main(String[] args) {
        int arr[]  = {3,2,4}; int target=6;

        int[] index = sumIndexes(arr,target);
        for(int i:index)
        {
            System.out.println(i);
        }

    }
}
