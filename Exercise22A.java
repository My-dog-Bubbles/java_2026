/*
Write a program that prompts the user to enter a string and displays the 
maximum consecutive increasingly ordered substring. Analyze the time 
complexity of your program.
 */

// Write your imports here if needed
import java.util.*;

public class Exercise22A {

    public static void main(String[] args) {
        // Write your code here
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = keyboard.nextLine();
        String maxConsecutive = "";
        String currentConsecutive = "" + inputString.charAt(0);

        for (int i = 1; i < inputString.length(); i++) {
            if (inputString.charAt(i) > inputString.charAt(i - 1)) {
                currentConsecutive += inputString.charAt(i);
            } else {
                if (currentConsecutive.length() > maxConsecutive.length()) {
                    maxConsecutive = currentConsecutive;
                }
                currentConsecutive = "" + inputString.charAt(i);
            }
        }
        if (currentConsecutive.length() > maxConsecutive.length()) {
            maxConsecutive = currentConsecutive;
        }
        System.out.print("Maximum consecutive increasingly ordered substring is " + maxConsecutive);
    }
}
