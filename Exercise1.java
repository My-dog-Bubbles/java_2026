// Write your imports here if needed
import java.util.*;
public class Exercise1 {

    // Write your code here
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String numLine1;
        String numLine2;

        // Create the 2 PriorityQueue to store the integers
        PriorityQueue<Integer> PQ1 = new PriorityQueue<>();
        PriorityQueue<Integer> PQ2 = new PriorityQueue<>();

        // line of integers read as a string
        System.out.println("Enter integers for priority queue 1: ");
        numLine1 = keyboard.nextLine();

        System.out.println("Enter integers for priority queue 2: ");
        numLine2 = keyboard.nextLine();

        // Split the full string of integers into individual numbers
        String[] numbers1 = numLine1.split(" ");
        String[] numbers2 = numLine2.split(" ");

        // Add each number to the PriorityQueue 1 and 2
        for (String num : numbers1) {
            PQ1.offer(Integer.parseInt(num));
        }
        for (String num : numbers2) {
            PQ2.offer(Integer.parseInt(num));
        }

        // union of the two priority queues
        PriorityQueue<Integer> union = new PriorityQueue<>();
        union.addAll(PQ1);
        union.addAll(PQ2);

        System.out.println("The union of the two priority queues is ");
        while (!union.isEmpty()) {
            System.out.print(union.poll() + " ");
        }
        System.out.println("");

        // difference of the two priority queues
        PriorityQueue<Integer> difference = new PriorityQueue<>();
        difference.addAll(PQ1);
        difference.removeAll(PQ2);
        System.out.println("The difference of the two priority queues is ");
        while (!difference.isEmpty()) {
            System.out.print(difference.poll() + " ");
        }
        System.out.println("");

        // intersection of the two priority queues
        PriorityQueue<Integer> intersection = new PriorityQueue<>();
        intersection.addAll(PQ1);
        intersection.retainAll(PQ2);
        System.out.println("The intersection of the two priority queues is ");
        while (!intersection.isEmpty()) {
            System.out.print(intersection.poll() + " ");
        }
    }
}