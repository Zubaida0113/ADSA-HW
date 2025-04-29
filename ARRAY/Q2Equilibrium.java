package ARRAY;

public class Q2Equilibrium {
    // Function to find the equilibrium index
    // O(n) time complexity
    // O(n) space complexity
    private static int findEquilibrium(int a[], int n) {
        int TS = 0;
        int LS = 0;
        int RS = 0;
        int p[] = new int[n];
        // Total sum of the array
        p[0] = a[0];
        for (int i = 1; i < n; i++) {
            p[i] = p[i - 1] + a[i];
        }
        TS = p[n - 1];
        // as we are excluding the extreme elements to prevent arrayindexoutofbound
        // we are starting from 1 and ending at n-1
        for (int i = 1; i < n - 1; i++) {
            LS = p[i] - a[i];
            RS = TS - p[i];
            if (LS == RS) {
                return i;
            }
        }
        return -1; // No equilibrium index found
    }

    /* Algorithm
     * First, compute the total sum of the array.
     * Iterate once:
     * At each index i, subtract a[i] from totalSum to get the right sum.
     * Compare it with the left sum.
     * If equal → equilibrium index found.
     * Update leftSum by adding a[i].
     */
    // o(n) time complexity
    // o(1) space complexity
    private static int findEquilibriumOptimized(int a[], int n) {
        int TS = 0;
        int LS = 0;
        // Total sum of the array
        for (int i = 0; i < n; i++) {
            TS += a[i];
        }
        // as we are excluding the extreme elements to prevent arrayindexoutofbound
        // we are starting from 1 and ending at n-1
        for (int i = 0; i < n; i++) {
            TS -= a[i];
            if (LS == TS) {
                return i;
            } else {
                LS += a[i];
            }
        }
        return -1; // No equilibrium index found
    }

    public static void main(String[] args) {
        int a[] = { 4, -2, 3, 8, -6 };
        int n = a.length;

        System.out.println("Equilibrium point: " + findEquilibrium(a, n));
        System.out.println("Equilibrium point Optimized: " + findEquilibriumOptimized(a, n));

    }
}
