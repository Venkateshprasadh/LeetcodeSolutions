package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    // OPTIMISATION NEEDED LOGICALLY CORRECT , SO TESTCASE FAIL SINCE TAKING TOO MUCH TIME
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
  //      int arr[] = {2,3,6,7}; int target = 9;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        List<List<Integer>> output = new ArrayList<>();
        function(0,candidates,list,0,target,candidates.length,output);
        return output;
    }

    private static void function(int i,int[] arr,List<Integer> list,int s,int target,int n,List<List<Integer>> output)
    {
        if(i==n)
        {
            if(s==target)
            {
                System.out.print(list);
                 output.add(list);
            }
            return;
        }
        list.add(arr[i]);
        s+=arr[i];
        function(i+1,arr,list,s,target,n,output);
        list.remove(list.size()-1);
        s-=arr[i];
        function(i+1, arr, list, s, target, n,output);

    }

    public static void main(String[] args) {
        int arr[] = {14,6,25,9,30,20,33,34,28,30,16,12,31,9,9,12,34,16,25,32,8,7,30,12,33,20,21,29,24,17,27,34,11,17,30,6,32,21,27,17,16,8,24,12,12,28,11,33,10,32,22,13,34,18,12}; int target = 27;
        combinationSum(arr,target);
//        List<Integer> list = new ArrayList<>();
//        List<List<Integer>> output = new ArrayList<>();
//        function(0,arr,list,0,target,arr.length,output);

    }
}
