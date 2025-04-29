package ARRAY;


import java.util.HashSet;

public class Q16MaximumXOR  {

    public static int findMaximumXOR(int[] nums) {
        int maxXor = 0;
        int mask = 0;

        for (int i = 31; i >= 0; i--) {
            mask |= (1 << i);
            HashSet<Integer> set = new HashSet<>();

            for (int num : nums) {
                set.add(num & mask);
            }

            int candidate = maxXor | (1 << i);
            for (int prefix : set) {
                if (set.contains(candidate ^ prefix)) {
                    maxXor = candidate;
                    break;
                }
            }
        }

        return maxXor;
    }

    public static void main(String[] args) {
        int[] nums = {3, 10, 5, 25, 2, 8};
        System.out.println("Maximum XOR of two numbers: " + findMaximumXOR(nums)); // Output: 28
    }
}

