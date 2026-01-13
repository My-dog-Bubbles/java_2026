import java.io.*;
import java.util.Date;

/**
 * Exercise 2: Write and read binary data
 * 
 * Requirements:
 * Part 1 - WRITE:
 * - Store an array of five int values: 1, 2, 3, 4, 5
 * - Store a Date object for the current time
 * - Store the double value 5.5
 * - Write all to file named Exercise17_02.dat
 * 
 * Part 2 - READ:
 * - In the same program, read the data back
 * - Display all values to verify they were stored correctly
 * 
 * @author Your Name
 */
public class exercise2_starter {
    
    public static void main(String[] args) throws IOException {
        
        // Data to write
        int[] numbers = {1, 2, 3, 4, 5};
        Date currentTime = new Date();
        double value = 5.5;
        
        // PART 1: WRITE DATA
        // TODO: Create DataOutputStream for "Exercise17_02.dat"
        
        
        // TODO: Write the array of integers
        // Hint: Loop through the array and use writeInt() for each element
        
        
        // TODO: Write the Date object
        // Hint: Use writeLong() to write currentTime.getTime()
        
        
        // TODO: Write the double value
        
        
        // TODO: Close the output stream (or use try-with-resources)
        
        
        System.out.println("Data written to Exercise17_02.dat");
        
        
        // PART 2: READ DATA
        // TODO: Create DataInputStream for "Exercise17_02.dat"
        
        
        // TODO: Read the array of integers
        // Hint: Create a new array and use readInt() five times
        
        
        // TODO: Read the Date object
        // Hint: Use readLong() and create new Date with that value
        
        
        // TODO: Read the double value
        
        
        // TODO: Close the input stream (or use try-with-resources)
        
        
        // TODO: Display all the data you read
        System.out.println("\nData read from Exercise17_02.dat:");
        // Display array, date, and double value
        
    }
}