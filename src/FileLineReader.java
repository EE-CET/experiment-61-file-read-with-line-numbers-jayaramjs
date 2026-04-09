import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLineReader {
    public static void main(String[] args) {
        // Use relative path as per instructions
        String fileName = "input.txt";
        
        // try-with-resources ensures the file is closed automatically
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 1;

            // readLine() returns null when the end of the file is reached
            while ((line = br.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            // Handle cases where the file might be missing or unreadable
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
