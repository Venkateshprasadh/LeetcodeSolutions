package Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
    /**
     * Problem: For each element in nums1, find the next greater element in nums2.
     * Approach:
     * - Use a **monotonic decreasing stack** to process elements in nums2 from right to left.
     * - For each element, the top of the stack will contain the next greater element.
     * - If the current element is greater than or equal to the stack top, pop until a greater is found or stack becomes empty.
     * - Maintain a hashmap to store the next greater element for each number in nums2.
     * - Finally, map the result for each element in nums1 using the hashmap.
     *
     * Time Complexity: O(n + m), where n = nums1.length, m = nums2.length
     * Space Complexity: O(m) for the hashmap and stack
     *
     * @param nums1 Subset of nums2
     * @param nums2 Superset containing all elements
     * @return Array of next greater elements corresponding to nums1
     */
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[nums1.length];
        for(int i= nums2.length-1;i>=0;i--)
        {
            while(!stack.empty() && stack.peek()<nums2[i])
            {
                stack.pop();
            }
            if(!stack.isEmpty() && stack.peek()>nums2[i])
            {
                map.put(nums2[i],stack.peek());
            }
            else {

                map.put(nums2[i],-1);
            }
            stack.push(nums2[i]);

        }
        for (int i=0;i< nums1.length;i++)
        {
            ans[i]=map.get(nums1[i]);
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};int[] nums2 = {1,3,4,2};
        Arrays.stream(nextGreaterElement(nums1, nums2)).forEach(s-> System.out.println(s));
    }
}
