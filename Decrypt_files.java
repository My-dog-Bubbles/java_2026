/* 
Name:
Date:
Purpose: Write a program to decode an encrypted file. Your program should prompt the user to enter an input file name
for the encrypted file and an output file name for the unencrypted version of the input file. 
*/
import java.io.*;
import java.util.*;

public class Decrypt_files {
    
    public static void main(String[] args) {
        // Your decryption logic here
        

        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an input file name (EX: fileName.txt)");
        String inputFile = keyboard.next();

        System.out.println("enter an Output file name (EX: fileName.txt)");
        String outputFile = keyboard.next();

        try {
            BufferedInputStream input = new BufferedInputStream(new FileInputStream(inputFile));

            // Implement decryption logic here
            System.out.println("Exercise17_14.txt is working");

            int info = 0;
            while((info = input.read())!= -1){
                input.write(info - 5);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
