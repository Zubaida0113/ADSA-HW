package ARRAY;

// Time: O(n) 
// Space: O(1) 
public class Q3checkEqualSplit {

    private static boolean equalSplit(int a[], int n) {
        int TS = 0;
        int LS = 0;
        if (n < 2)
            return false;
        for (int i = 0; i < n; i++) {
            TS += a[i];
        }

        for (int i = 0; i < n; i++) {
            TS -= a[i];
            if (LS == TS) {
                return true;
            } else {
                LS += a[i];
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // int a[] = { 4, -2, 3, 8, -6 };
        int a[] = { 1, 2, 3, 3 };
        int n = a.length;
        boolean result = equalSplit(a, n);
        if (result) {
            System.out.println("YES The array can be split into two equal halves.");
        } else {
            System.out.println("NO The array cannot be split into two equal halves.");
        }
    }
}
