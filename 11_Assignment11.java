//Name : Dipak Mohite
//Roll : 236
//Class : DSY-Computer


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment11 {
    public static void main(String[] args) {
        // File handling operations
        try {
            // Creating a new file
            File file = new File("example.txt");
			
            File file2 = new File("example2.txt");
			
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            
            // Writing to a file
            FileWriter writer = new FileWriter(file);
            writer.write("This is a sample text.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
            
            // Reading from a file
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            br.close();
            
            // Deleting a file
           
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}