package ARRAY;

public class Q8Permutations {
    

    // Helper function to swap characters
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Recursive function to generate permutations
    private static void generatePermutations(char[] arr, int index) {
        if (index == arr.length - 1) {
            System.out.println(new String(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);                        // Step 1: Fix character at index
            generatePermutations(arr, index + 1);       // Step 2: Recurse
            swap(arr, index, i);                        // Step 3: Backtrack
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        generatePermutations(str.toCharArray(), 0);
    }
}

