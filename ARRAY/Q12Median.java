package ARRAY;
//Time Complexity: O(n+m) where n and m are the lengths of the two arrays.
//Space Complexity: O(n+m) for the merged array
//Algorithm:
//1. Create a merged array of size n+m.
//2. Use two pointers to traverse both arrays and fill the merged array in sorted order.
//3. After merging, check if the total number of elements is even or odd.   
//4. If even, return the average of the two middle elements.
//5. If odd, return the middle element.
//6. Print the median.

public class Q12Median {
    
    private static double findMedianSortedArrays(int [] a,int[] b){
        int n = a.length;
        int m = b.length;

        if (n > m) {
            return findMedianSortedArrays(b, a); // Ensure a is the smaller array
        }

        int[] merged = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                merged[k++] = a[i++];
            } else {
                merged[k++] = b[j++];
            }
        }
        while (i < n) {
            merged[k++] = a[i++];
        }   
        while (j < m) {
            merged[k++] = b[j++];
        }
        int total = n + m;
        if (total % 2 == 0) {
            return (merged[total / 2] + merged[(total / 2) - 1]) / 2.0;
        } else {
            return merged[total / 2];
        }
       
        
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2,4,5};
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median);
    }
}
