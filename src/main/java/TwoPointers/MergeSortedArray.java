package TwoPointers;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
       for(int i=m;i<(m+n);i++)
       {
           nums1[i]=nums2[j];
           j++;
       }
        Arrays.sort(nums1);
        Arrays.stream(nums1).forEach(n1->System.out.println(n1));


    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3,n=3;int[]  nums2 = {2,5,6};
        merge(nums1,m,nums2,n);
    }
}
