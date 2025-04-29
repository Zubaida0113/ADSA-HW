package ARRAY;

// Time Complexity: O(n)
// Space Complexity: O(1)
// This code counts the numbers with unique digits up to n digits.
public class Q18UniqueNoDigits{

    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;  // 0 digits => 1 (empty number)
        if (n == 1) return 10; // 1 digit => 10 (0-9)

        int result = 10;  // Start with 1-digit numbers (0-9)

        int product = 9;
        for (int i = 2; i <= n; i++) {
            product *= (11 - i);  // (9 * 9 * 8 * ... for the i-th digit)
            result += product;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println("Count of numbers with unique digits for " + n + " digits: " + countNumbersWithUniqueDigits(n));
    }
}

