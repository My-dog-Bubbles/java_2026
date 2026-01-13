/*
Name: Angel Carmichael
Date: 1/12/26
Purpose:
  - Create a file named Exercise17_01.txt if it does not exist
  - If the file already exists, APPEND new data (don't overwrite)
  - Write 100 integers created randomly (use Math.random())
  - Integers should be separated by a space
  - Use text I/O (PrintWriter)
*/
import java.io.*;

/**
 * @return 100 integers created randomly
 * @param Write 100 integers created randomly (use Math.random()) separated by a space in file
 * @author Angel Carmichael
 */
public class exercise1_starter {
    
    public static void main(String[] args) throws IOException {
        // TODO: Create a File object for "Exercise17_01.txt"
        FileOutputStream file1 = null;
        
        // TODO: Create PrintWriter in APPEND mode
        // Hint: Use FileWriter with append parameter set to true
        try {
            file1 = new FileOutputStream("Exercise17_01.txt");

            // TODO: Generate and write 100 random integers
            // Hint: Use Math.random() to generate random integers
            // Hint: Separate integers with a space
            for (int i = 0 ; i < 100 ; i++) {
                int randomInt = (int)(Math.random() * 100); // Random integer between 0 and 99
                file1.write((randomInt + " ").getBytes());
            }

            // TODO: Close the file (or use try-with-resources)
            file1.close();

        } catch (Exception nonexisting) { // Exception if the file does not exist
            System.out.println("This file does not exists");
        }
        
        System.out.println("100 random integers written to Exercise17_01.txt");
    }
}
