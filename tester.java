import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ask user for the file names
        System.out.print("Enter input file name: ");
        String inputFile = input.nextLine();
        System.out.print("Enter output file name: ");
        String outputFile = input.nextLine();
        try {
            // open the files
            FileInputStream in = new FileInputStream(inputFile);
            FileOutputStream out = new FileOutputStream(outputFile);
            // read each byte and subtract 5 to decrypt it
            int b;
            while ((b = in.read()) != -1) {
                out.write(b - 5);
            }
            // close the files
            in.close();
            out.close();
            System.out.println("File decrypted successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
