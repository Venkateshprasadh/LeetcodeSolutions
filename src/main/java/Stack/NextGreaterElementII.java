package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {

    /**
     * Problem: Given a circular array, return the next greater number for every element.
     * If it doesn't exist, return -1 for that position.
     *
     * Key Idea: Use a decreasing monotonic stack while iterating 2n times in reverse to simulate the circular array.
     * (We use nums[i % n] to wrap around the array.)
     *
     * Stack will store elements in decreasing order — so the top of the stack will always have the next greater element.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums.length];
        int n = nums.length;

        // Iterate from (2n - 1) to 0 to simulate circular array
        for (int i = (2 * n) - 1; i >= 0; i--) {
            // Remove all elements smaller than or equal to current, since they can't be the next greater
            while (!stack.empty() && stack.peek() <= nums[i % n]) {
                stack.pop();
            }

            // Only fill the answer array for the first n elements
            if (i < n) {
                ans[i] = !stack.isEmpty() ? stack.peek() : -1;
            }

            // Push current element to stack for next iterations
            stack.push(nums[i % n]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 3};
        Arrays.stream(nextGreaterElements(nums)).forEach(s -> System.out.println(s));
    }
}
