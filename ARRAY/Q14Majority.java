package ARRAY;

import java.util.HashMap;

public class Q14Majority {

    public static int findMajorityElement(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

            if (freqMap.get(num) > n / 2) {
                return num;
            }
        }

        return -1; // No majority element
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 3, 3, 3};
        int result = findMajorityElement(nums);
        if (result != -1) {
            System.out.println("Majority element: " + result);
        } else {
            System.out.println("No majority element found");
        }
    }
}
// ✅ Time Complexity:
// O(n) — one pass through the array

// ✅ Space Complexity:
// O(n) — in the worst case (all elements differ