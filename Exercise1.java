// Write your imports here if needed

import java.util.*;

public class Exercise1 {

    // Write your code here
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String numLine1;
        String numLine2;

        // Create the 2 PriorityQueue to store the integers
        PriorityQueue<String> PQ1 = new PriorityQueue<>();
        PriorityQueue<String> PQ2 = new PriorityQueue<>();

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
            PQ1.offer(num);
        }
        for (String num : numbers2) {
            PQ2.offer(num);
        }

        // union of the two priority queues
        PriorityQueue<String> union = new PriorityQueue<>();
        union.addAll(PQ1);
        union.addAll(PQ2);
        System.out.println("The union of the two priority queues is " + union);

        // difference of the two priority queues
        PriorityQueue<String> difference = new PriorityQueue<>();
        difference.addAll(PQ1);
        System.out.println("The difference of the two priority queues is " + difference.removeAll(PQ2));

        // intersection of the two priority queues
        PriorityQueue<String> intersection = new PriorityQueue<>();
        intersection.addAll(PQ1);
        System.out.println("The intersection of the two priority queues is " + intersection.retainAll(PQ2));
    }
}
