package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        List<List<Integer>> output = new ArrayList<>();
        f(0,candidates,candidates.length,target,0,list,output);
        return output;
    }

    private static void f(int ind, int[] arr,int n,int target, int sum,List<Integer> list,List<List<Integer>> output)
    {
            if(ind==n)
            {
                if(sum==target)
                {
                    System.out.print(list);
                    output.add(new ArrayList<>(list));

                }
                return;
            }
        if (ind >= arr.length || sum < 0) {
            return;
        }
            if(sum<target && arr[ind]<target)
            {
                list.add(arr[ind]);
                sum+=arr[ind];
                f(ind, arr, n, target, sum, list, output);
                list.remove(list.size()-1);
                sum-=arr[ind];

            }
            f(ind+1, arr, n, target, sum, list, output);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5}; int target=8;
        List<List<Integer>> list = combinationSum(arr,target);
        System.out.print(list);
    }
}
