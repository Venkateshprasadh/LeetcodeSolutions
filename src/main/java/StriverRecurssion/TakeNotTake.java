package StriverRecurssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TakeNotTake {

    public static void subSeq(int[] arr, List<Integer> list , int ind, int n)
    {
        if(ind==n)
        {
            list.stream().forEach(s-> System.out.print(s+" "));
            if (list.size()==0)
            {
                System.out.print("{}");
            }
            System.out.println();
            return;
        }
        // take or pick the element into subsequence
        list.add(arr[ind]);
        subSeq(arr,list,ind+1,n);
        list.remove(list.size()-1);

        // not take  this element not added to subsequence
        subSeq(arr,list,ind+1,n);


    }

    public static void subSeqSumEqualsK(int ind, List<Integer> list ,int[] arr , int sum,int target,int n)
    {
        if(ind==n)
        {
            if(sum==target)
            {
                list.stream().forEach(s-> System.out.print(s+" "));
                System.out.println();
            }return;
        }
        list.add(arr[ind]);
        sum+=arr[ind];
        subSeqSumEqualsK(ind+1,list,arr,sum,target,n);
        list.remove(list.size()-1);
        sum-=arr[ind];
        subSeqSumEqualsK(ind+1,list,arr,sum,target,n);
    }

    public static int CountOfSubSeqSumEqualsK(int ind, List<Integer> list ,int[] arr , int sum,int target,int n)
    {
        if(ind==n)
        {
            if(sum==target)
            {
               // list.stream().forEach(s-> System.out.print(s+" "));
               // System.out.println();
                return 1;
            }return 0;
        }
        list.add(arr[ind]);
        sum+=arr[ind];
       int lcount= CountOfSubSeqSumEqualsK(ind+1,list,arr,sum,target,n);
        list.remove(list.size()-1);
        sum-=arr[ind];
        int rcount = CountOfSubSeqSumEqualsK(ind+1,list,arr,sum,target,n);

        return lcount+rcount;
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target){
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> output = new ArrayList<>();
        candidates(0,candidates,candidates.length,target,list,output);
        return output;
    }

    private static void candidates(int i, int[] candidates, int length, int target, List<Integer> list, List<List<Integer>> output) {
        if(i==length)
        {
            if(target==0)
            {
                output.add(new ArrayList<>(list));
            }
            return;
        }
        if (i == candidates.length || target < 0) {
            return;
        }
        if(candidates[i]<=target)
        {
            list.add(candidates[i]);
            candidates(i,candidates,candidates.length,target-candidates[i],list,output);
            list.remove(list.size()-1);
        }
        candidates(i+1,candidates,candidates.length,target,list,output);
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        List<List<Integer>> output = new ArrayList<>();
        candidatesII(0,candidates,candidates.length,target,list,output);
        return output;

    }

    private static void candidatesII(int i, int[] candidates, int length, int target ,List<Integer> list, List<List<Integer>> output) {
        if(i==length)
        {
            if(target==0)
            {
                output.add(new ArrayList<>(list));
            }
            return;
        }
        if (i >= candidates.length || target < 0) {
            return;
        }
        list.add(candidates[i]);
        candidatesII(i+1,candidates,candidates.length,target-candidates[i],list,output);
        list.remove(list.size()-1);
        while (i + 1 < candidates.length && candidates[i] == candidates[i + 1]) {
            i++;
        }
        candidatesII(i+1,candidates,candidates.length,target,list,output);
    }

    public static   List<Integer> subSetCallMethod(int[] subSet) {
        List<Integer> list = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        subsetSum(subSet,0,subSet.length,output,0);
        return output.stream().sorted().collect(Collectors.toList());
    }
    public static void subsetSum(int[] subset,int ind,int n,List<Integer> output,int sum)
    {
        if(ind==n)
        {
            output.add(sum);
            return;
        }
        sum+=subset[ind];
        subsetSum(subset,ind+1,n,output,sum);

        sum-=subset[ind];
        subsetSum(subset,ind+1,n,output,sum);
    }
    public static List<List<Integer>> subSetII(int[] subset) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(subset);
        subsetII(0,subset,subset.length,list,output);
        return output;
    }

    private static void subsetII(int ind, int[] subset, int length, List<Integer> list, List<List<Integer>> output) {
        if(ind==length)
        {
            output.add(new ArrayList<>(list));
            return;
        }
        list.add(subset[ind]);
        subsetII(ind+1,subset,length,list,output);
        list.remove(list.size()-1);
        while (ind + 1 < subset.length && subset[ind] == subset[ind + 1]) {
            ind++;
        }
        subsetII(ind+1,subset,length,list,output);
    }

    public static void main(String[] args) {
        /*int[] arr = {3,1,2};
        subSeq(arr,new ArrayList<>(),0,arr.length);*/

    //    int[] arr = {1,2,1};
     //   subSeqSumEqualsK(0,new ArrayList<>(),arr,0,2,arr.length);

     //   System.out.println(CountOfSubSeqSumEqualsK(0,new ArrayList<>(),arr,0,2,arr.length));

       /*int[] candidates = {2,3,6,7};int target = 7;
        System.out.println(combinationSum(candidates,target));*/

        /*int[] candidates = {10,1,2,7,6,1,5}; int target = 8;
        System.out.println(combinationSum2(candidates,target));*/

        /*int[] subset = {2,3};
        System.out.println(subSetCallMethod(subset));*/

        int[] arr = {2,1,2};
        System.out.println(subSetII(arr));
    }
}
