/*
Name: Angel Carmichael
Date: January 20, 2026

Description: Use BigInteger class to find the factorial for a large number. Implement the factorial method using recursion. 
Prompt the user to enter an integer and display its factorial.

Assignment name: Exercise 18.1: Compute factorial using recursion with BigInteger

Example: 100! is a huge number with 158 digits!
 */
import java.math.BigInteger;
import java.util.*;

public class exercise18_01 {

    /**
     * Recursive factorial method using BigInteger
     *
     * TODO: Implement this method
     *
     * Base case: if n equals 0, return 1 Recursive case: return n * factorial(n
     * - 1)
     *
     * Hint: Use BigInteger methods: - n.equals(BigInteger.ZERO) to check if n
     * is 0 - n.multiply(other) to multiply - n.subtract(BigInteger.ONE) to
     * subtract 1
     *
     * @param n the number to compute factorial for
     * @return n! as a BigInteger
     */
    public static BigInteger factorial(BigInteger n) {
        // makes sure that the input is not negative
        if (n.compareTo(BigInteger.ZERO) < 0) {
            throw new StackOverflowError("the number must be a positive number");
        }

        // TODO: Implement base case
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {  // TODO: Implement recursive case
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }

    /**
     * Main method to prompt user and display factorial
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = input.nextInt();

        // Convert to BigInteger
        BigInteger n = new BigInteger(String.valueOf(number));

        // Calculate factorial
        BigInteger result = factorial(n);

        // Display result
        System.out.println(number + "! = " + result);

        input.close();
    }
}
