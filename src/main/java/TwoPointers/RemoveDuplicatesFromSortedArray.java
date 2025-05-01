package TwoPointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;


public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
       /* Stack<Integer> stack = new Stack<>();
        int l=1, count =0;
        int counter=0;
        stack.push(nums[l]);
        count++;
        while (l<nums.length)
        {
            if(!stack.isEmpty() && stack.peek()==nums[l] && stack.size()<=2)
            {
                stack.push(nums[l]);
                count++;
            }
            else {
                while(counter<l && !stack.isEmpty())
                {
                    nums[counter]=stack.pop();
                    counter++;
                }
              //  stack.removeAllElements();
                stack.push(nums[l++]);
                count++;
            }

            l++;
        }*/
        int n = nums.length;
        if (n <= 2) {
            return n;
        }

        int slow = 2;
        for (int fast = 2; fast < n; fast++) {
            if (nums[fast] != nums[slow - 2]) {
                if (slow != fast) { // Avoid unnecessary self-assignment
                    nums[slow] = nums[fast];
                }
                slow++;
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(arr));
    }
}
