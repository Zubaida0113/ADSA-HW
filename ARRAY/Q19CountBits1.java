package ARRAY;

// Time Complexity: O(n)
// Space Complexity: O(n)
public class Q19CountBits1 {
    public static int[] countBits(int n) {
        int[] res = new int[n + 1];
        res[0] = 0;

        for (int i = 1; i <= n; i++) {
            res[i] = res[i >> 1] + (i & 1);
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 5;
        int total = 0;
        int[] result = countBits(n);
        for (int i = 0; i <= n; i++) {
            total += result[i];

        }
        System.out.println(total);
    }
}
