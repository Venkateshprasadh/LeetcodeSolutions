package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> output = new ArrayList<>();
        f(0,nums,nums.length,list,output);
        return output;
    }
    private static void f(int ind, int[] arr, int n,List<Integer> list, List<List<Integer>> output)
    {
        if(ind==n)
        {
              //  System.out.print(list);
                output.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[ind]);
        f(ind+1, arr, n, list, output);
        list.remove(list.size()-1);

        f(ind+1, arr, n, list, output);

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        List<List<Integer>> list = subsets(arr);
        System.out.print(list);
    }
}
