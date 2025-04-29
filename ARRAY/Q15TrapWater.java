package ARRAY;

//Time Complexity: O(n)
//Space Complexity: O(n) for the prefix and suffix arrays
//Algorithm:
//1. Create two arrays prefixMax and suffixMax of the same size as height.
//2. Fill prefixMax with the maximum height from the left to the right.
//3. Fill suffixMax with the maximum height from the right to the left.
//4. Iterate through the height array and calculate the trapped water at each index.
//5. The trapped water at index i is the minimum of prefixMax[i] and suffixMax[i] minus height[i].
//6. Sum up the trapped water for all indices to get the total trapped water.
//7. Return the total trapped water.

public class Q15TrapWater {
    public static int trap(int[] height) { 
        int n = height.length;
        if (n == 0) return 0;

        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];

        prefixMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], height[i]);
        }

        suffixMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], height[i]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            trappedWater += Math.min(prefixMax[i], suffixMax[i]) - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int[] a = {3, 0, 2, 0, 4};
        System.out.println("Total water trapped: " + trap(a)); // Output: 7
    }
}

