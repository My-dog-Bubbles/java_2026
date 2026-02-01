
import java.util.*;

/**
 * Tower of Hanoi Lab
 *
 * The Tower of Hanoi is a classic problem that demonstrates recursion.
 *
 * Rules: - You have 3 pegs (A, B, C) and n disks of different sizes - All disks
 * start on peg A, sorted by size (largest at bottom) - Goal: Move all disks
 * from peg A to peg C - Only one disk can be moved at a time - A larger disk
 * can never be placed on top of a smaller disk
 *
 * Recursive solution: To move n disks from source to destination using
 * auxiliary peg: 1. Move n-1 disks from source to auxiliary (using destination
 * as helper) 2. Move the largest disk from source to destination 3. Move n-1
 * disks from auxiliary to destination (using source as helper)
 *
 * @author Angel Carmichael
 * @date January 25, 2026
 */
public class TowerOfHanoi {

    private static char pegA = '1';
    private static char pegB = '2';
    private static char pegC = '3';

    private static ArrayList<Integer> pegAList = new ArrayList<>();
    private static ArrayList<Integer> pegBList = new ArrayList<>();
    private static ArrayList<Integer> pegCList = new ArrayList<>();

    // Part 3: Move counter (you'll add this)
    private static int moveCount = 0;

    /**
     * PART 1: Implement the classic Tower of Hanoi solver
     *
     * TODO: Implement this recursive method
     *
     * Base case: if n == 1, move disk from source to destination Recursive
     * case: 1. Move n-1 disks from source to auxiliary (using destination) 2.
     * Move disk n from source to destination 3. Move n-1 disks from auxiliary
     * to destination (using source)
     *
     * @param n number of disks to move
     * @param source the source peg (e.g., 'A')
     * @param destination the destination peg (e.g., 'C')
     * @param auxiliary the auxiliary peg (e.g., 'B')
     */
    private static void moveChecker(int disk, char source, char destination) {
        moveCount++;

        // Get source and destination peg lists
        ArrayList<Integer> fromPeg = getPegList(source);
        ArrayList<Integer> toPeg = getPegList(destination);

        // Move the top disk
        fromPeg.remove(fromPeg.size() - 1);
        toPeg.add(disk);

        // Print the move and tower state
        System.out.println("MOVE DISK " + disk + " FROM " + source + " TO " + destination);
        displayTowers();
    }

    public static void moveDisks(int n, char source, char destination, char auxiliary) {
        for (int i = n; i >= 2; i++) {
            pegAList.add(0);
        }

        // TODO: Implement base case
        if (n == 1) {
            System.out.println("MOVE DISK " + n + " FROM " + source + " to " + destination);
            pegAList.remove(n);
            pegCList.addLast(0);
        } else { // TODO: Implement recursive case (3 steps)
            moveDisks(n - 1, source, auxiliary, destination);
            System.out.println("MOVE DISK " + n + " FROM " + source + " to " + destination);
            pegAList.remove(n - 1);
            pegCList.addLast(0);
            moveDisks(n - 1, auxiliary, destination, source);
        }
        displayTowers();
    }

    /**
     * PART 2: Add visualization
     *
     * Modify this method to display the state of the towers after each move.
     *
     * You can represent the towers however you like. Example: A: [3, 2, 1] B:
     * [] C: []
     *
     * Or get creative with ASCII art!
     *
     * Hint: You'll need to track which disks are on which peg. Consider using
     * ArrayList<Integer> for each peg.
     */
    private static ArrayList<Integer> getPegList(char peg) {
        switch (peg) {
            case '1':
                return pegAList;
            case '2':
                return pegBList;
            case '3':
                return pegCList;
            default:
                throw new IllegalArgumentException("Invalid peg: " + peg);
        }
    }

    public static void displayTowers() {
        // TODO: Implement tower visualization
        System.out.println("--- Tower State ---");
        // Display pegs A, B, C and their disks
        System.out.println("A: " + pegAList);
        System.out.println("B: " + pegBList);
        System.out.println("C: " + pegCList);
    }

    /**
     * PART 3: Add move counting and validation
     *
     * Enhance your solution to: 1. Count total moves 2. Verify the solution
     * uses the minimum number of moves (2^n - 1) 3. Optional: Add validation to
     * ensure no illegal moves
     */
    public static void printStatistics(int n) {
        // TODO: Print statistics
        System.out.println("\n=== Statistics ===");
        System.out.println("Number of disks: " + n);
        System.out.println("Total moves: " + moveCount);
        System.out.println("Minimum possible moves: " + ((int) Math.pow(2, n) - 1));

        // Verify correctness
        if (moveCount == (int) Math.pow(2, n) - 1) {
            System.out.println("SUCCESS! Optimal solution.");
        } else {
            System.out.println("WARNING: Not optimal.");
        }
    }

    public static void main(String[] args) {
        int n = 3; // Start with 3 disks
        char pegA = '1';
        char pegB = '2';
        char pegC = '3';

        System.out.println("Tower of Hanoi - " + n + " disks");
        System.out.println("Moving disks from A to C using B\n");

        // Reset move counter
        moveCount = 0;

        // Solve the puzzle
        moveDisks(n, pegA, pegC, pegB);

        // Display statistics
        printStatistics(n);

        // Test with different numbers of disks
        System.out.println("\n\n=== Try with 4 disks ===");
        moveCount = 0;
        moveDisks(4, pegA, pegC, pegB);
        printStatistics(4);
    }
}
