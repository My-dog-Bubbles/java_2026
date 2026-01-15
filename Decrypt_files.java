/* 
Name: Angel Carmichael
Date: January 14, 2026
Description: Write a program to decode an encrypted file. Your program should prompt the user to enter an input file name
 for the encrypted file and an output file name for the unencrypted version of the input file. 
 */
import java.io.*;
import java.util.*;

/**
 * @param decode an encrypted file from users prompt. Your program should prompt
 * the user to enter an input and Output file name.
 * @author Angel Carmichael
 */
public class Decrypt_files {

    public static void main(String[] args) throws IOException {

        // Data to write
        int data;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the input file name for the input file (Ex: fileName.dat):");
        String inputFile = keyboard.nextLine();

        System.out.print("Enter the output file name for the output file (Ex: fileName.dat):");
        String outputFile = keyboard.nextLine();

        try {
            // PART 1: WRITE DATA

            // make the input and output Buffered stream
            BufferedInputStream Input = new BufferedInputStream(new FileInputStream(inputFile));
            BufferedOutputStream Output = new BufferedOutputStream(new FileOutputStream(outputFile));

            // write the information from input file to output file
            while ((data = Input.read()) != -1) {
                Output.write(data - 5);
            }

            // close the streams
            Input.close();
            Output.close();

            // Try to see if I can read the output file
            DataInputStream unencrypted = new DataInputStream(new FileInputStream(outputFile));
            System.out.println("The decrypted file content is:");
            while ((data = unencrypted.read()) != -1) {
                System.out.println(data);
            }
            unencrypted.close();
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

    }
}
