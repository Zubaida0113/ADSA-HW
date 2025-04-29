package ARRAY;

public class Q13KthsmallestMatrix{

    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0], high = matrix[n - 1][n - 1];

        while (low < high) {
            int mid = (low + high) / 2;
            int count = countLessEqual(matrix, mid);

            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    private static int countLessEqual(int[][] matrix, int target) {
        int count = 0, n = matrix.length, i = n - 1, j = 0;

        while (i >= 0 && j < n) {
            if (matrix[i][j] <= target) {
                count += (i + 1);
                j++;
            } else {
                i--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 8;
        System.out.println("Kth smallest element: " + kthSmallest(matrix, k));
    }
}

