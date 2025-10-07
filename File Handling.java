import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        // File name
        String fileName = "sample.txt";

        // Writing content to the file
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is a sample text file.\n");
            writer.write("This file is created using Java File Handling.\n");
            writer.write("File handling in Java is simple and powerful!");
            writer.close();
            System.out.println("File '" + fileName + "' created and content written successfully.\n");
        } 
        catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Reading content from the file
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);
            String line;

            System.out.println("Reading contents of '" + fileName + "':\n");

            // Reading line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            reader.close();
        } 
        catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}