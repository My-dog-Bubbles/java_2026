// Write your imports here if needed

import java.util.*;

public class Exercise {

    // Write your code here
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter strings for the first set: ");
        String set1 = keyboard.nextLine();

        System.out.println("Enter strings for the second set:");
        String set2 = keyboard.nextLine();

        TreeSet<String> treeSet1 = new TreeSet<>();
        TreeSet<String> treeSet2 = new TreeSet<>();

        String[] colors1 = set1.split(" ");
        String[] colors2 = set2.split(" ");

        // Add each number to the PriorityQueue 1 and 2
        for (String color : colors1) {
            treeSet1.add(color);
        }
        for (String color : colors2) {
            treeSet2.add(color);
        }
        System.out.println(treeSet1);
        System.out.println(treeSet2);

        TreeSet<String> unionTree = new TreeSet<>();
        unionTree.addAll(treeSet1);
        unionTree.addAll(treeSet2);

        System.out.println("The union of the two sets is " + unionTree);

        TreeSet<String> differenceTree = new TreeSet<>();
        differenceTree.addAll(treeSet1);
        differenceTree.removeAll(treeSet2);
        System.out.println("The difference of the two sets is " + differenceTree);

        TreeSet<String> intersectionTree = new TreeSet<>();
        intersectionTree.addAll(treeSet1);
        intersectionTree.retainAll(treeSet2);
        System.out.println("The intersection of the two sets is " + intersectionTree);
    }
}
