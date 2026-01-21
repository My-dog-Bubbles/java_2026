import java.util.Scanner;

/**
 * Exercise 18.2: Compute greatest common divisor using recursion
 *
 * The gcd(m, n) can be defined recursively as follows: - If m % n is 0, gcd(m,
 * n) is n - Otherwise, gcd(m, n) is gcd(n, m % n)
 *
 * This is the Euclidean algorithm.
 *
 * Write a recursive method to find the GCD. Prompt the user to enter two
 * integers and display their GCD.
 *
 * @author Angel Carmichael
 * @date January 20, 2026 Assignment name: Exercise 18.2: Compute greatest
 * common divisor using recursion
 */
public class exercise18_02 {

    /**
     * Recursive GCD method using Euclidean algorithm
     *
     * TODO: Implement this method
     *
     * Base case: if n is 0, return m Recursive case: return gcd(n, m % n)
     *
     * @param m first number
     * @param n second number
     * @return greatest common divisor of m and n
     */
    public static int gcd(int m, int n) {
        // TODO: Implement base case
        if (m % n == 0) {
            return n;
        } else { // TODO: Implement recursive case
            return gcd(n, m % n);
        }
    }

    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner input = new Scanner(System.in);

        // user input 1
        System.out.print("Enter first integer: ");
        int m = input.nextInt();

        // user input 2
        System.out.print("Enter second integer: ");
        int n = input.nextInt();

        // Calculate GCD
        int result = gcd(m, n);

        // Display result
        System.out.println("The greatest common divisor of " + m
                + " and " + n + " is " + result);

        input.close();
    }
}
