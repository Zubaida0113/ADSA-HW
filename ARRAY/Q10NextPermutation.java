package ARRAY;


import java.util.Arrays;

public class Q10NextPermutation {

   
    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        int breakpoint = -1;

        // Step 1: Find the breakpoint from right where arr[i] < arr[i+1]
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                breakpoint = i;
                break;
            }
        }

        // Step 4: If no breakpoint, reverse the whole array
        if (breakpoint == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // Step 2: Find the next greater element to swap with arr[breakpoint]
        for (int i = n - 1; i > breakpoint; i--) {
            if (arr[i] > arr[breakpoint]) {
                swap(arr, i, breakpoint);
                break;
            }
        }

        // Step 3: Reverse the part after the breakpoint
        reverse(arr, breakpoint + 1, n - 1);
    }


    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println("Next Permutation: " + Arrays.toString(nums));
    }
}

