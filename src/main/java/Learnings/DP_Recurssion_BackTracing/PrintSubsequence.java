package Learnings.DP_Recurssion_BackTracing;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequence {

    private static void function(int index, int[] arr, List<Integer> list, int n)
    {
        if(index==n)
        {
            for(int i: list)
            {
                System.out.print(i+" ");
            }
            if(list.size()==0)
            {
                System.out.print("{}");
            }
            System.out.println();

            return;
        }
        //take
        list.add(arr[index]);
        function(index+1,arr,list,n);
        list.remove(list.size()-1);

        //not take
        function(index+1,arr,list,n);

    }

    public static void main(String[] args) {
    int[] arr={3,1,2};
    List<Integer> list = new ArrayList<>();
    function(0,arr,list,arr.length);
    }
}
