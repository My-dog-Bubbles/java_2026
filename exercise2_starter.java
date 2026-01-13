import java.io.*;
import java.util.*;

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
        int num;
        Date newDate;
        List<Integer> newList = new ArrayList<>();     
        
        
        try {
            // PART 1: WRITE DATA
            // TODO: Create DataOutputStream for "Exercise17_02.dat"
            DataOutputStream Output = new DataOutputStream(new FileOutputStream("Exercise17_02.dat"));

            // TODO: Write the array of integers
            // Hint: Loop through the array and use writeInt() for each element 
            for(int i=0; i<numbers.length;i++){ 
                Output.writeInt(numbers[i]);
            }
          
            // TODO: Write the Date object
            // Hint: Use writeLong() to write currentTime.getTime()
            Output.writeLong(currentTime.getTime());

            // TODO: Write the double value
            Output.writeDouble(value);

            // TODO: Close the output stream (or use try-with-resources)
            Output.close();

            System.out.println("Data written to Exercise17_02.dat");

            // PART 2: READ DATA
            // TODO: Create DataInputStream for "Exercise17_02.dat"
            DataInputStream Input = new DataInputStream(new FileInputStream("Exercise17_02.dat"));

            System.out.println("Reading data from Exercise17_02.dat");

            // TODO: Read the array of integers
            // Hint: Create a new array and use readInt() five times
            while((num = Input.readInt()) != -1){
                newList.add(num);
            }

            // TODO: Read the Date object
            // Hint: Use readLong() and create new Date with that value
            Long dateReader = Input.readLong();
            newDate = new Date(dateReader);

            // TODO: Read the double value
            Input.readDouble();

            // TODO: Close the input stream (or use try-with-resources)
            Input.close();

            //Display array Date and number value:
            // System.out.println(newList);
            System.out.println(newDate);
            System.out.println(Input.readDouble());

        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}