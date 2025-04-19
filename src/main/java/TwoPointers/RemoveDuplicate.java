package TwoPointers;

public class RemoveDuplicate {

    private static int removedDuplicates(int arr[])
    {
        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[i]!=arr[j])
            {
                arr[++i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[] ={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removedDuplicates(arr));
    }
}
