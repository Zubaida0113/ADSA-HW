import java.util.Scanner;

public class gfg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        // Calculate the sum of the first n natural numbers
        int sum = (n * (n + 1)) / 2;

        // Output the result
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

        scanner.close();
    }
}
