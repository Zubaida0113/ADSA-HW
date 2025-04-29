package ARRAY;
//Time Complexity: O(n)
//Space Complexity: O(1)
// This code finds the maximum product of a contiguous subarray in an array of integers.
public class Q17MaxProductSubarray{

    public static int maxProduct(int[] nums) {
        // Edge case: if the array is empty, return 0
        if (nums.length == 0) return 0;

        // Initialize max and min products and result
        int maxProd = nums[0], minProd = nums[0], result = nums[0];

        // Traverse the array starting from index 1
        for (int i = 1; i < nums.length; i++) {
            // If the current number is negative, swap the max and min
            if (nums[i] < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            // Update maxProd and minProd for the current number
            maxProd = Math.max(nums[i], maxProd * nums[i]);
            minProd = Math.min(nums[i], minProd * nums[i]);

            // Update the result with the maximum product found so far
            result = Math.max(result, maxProd);
        }

        // Return the final result
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("Maximum Product Subarray: " + maxProduct(nums)); // Output: 6
    }
}

