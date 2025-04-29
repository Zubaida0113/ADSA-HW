package ARRAY;

public class Q4MaxSubaaraySum {
    
    private static int maxSubArraySum(int a[], int n,int k) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        if (k > n || k <= 0) {
            return -1; // Invalid case
        }

        for(int i=0;i<k;i++){
            currentSum+=a[i];
        }
        maxSum = currentSum;
        for(int i=k;i<n;i++){
            currentSum += a[i] - a[i-k];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
        
    public static void main(String[] args) {
        int a[] = { 2,3,4,1,2};
        int n = a.length;
        int k=6;
        int maxSum = maxSubArraySum(a, n,k);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
