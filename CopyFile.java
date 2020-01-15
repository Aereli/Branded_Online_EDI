import java.io.File;
import java.io.IOException;
import java.util.Scanner;
 
public class CopyFile {
    public static void main(String args[]) throws IOException {
        
        Scanner reader = new Scanner(System.in);
        boolean success = false;

            // This is an option if we want to CREATE a new directory
        File directory = new File("C:/Users/user1/Desktop/test");
        if(directory.exists()) {
            System.out.println("Directory already exists ...");

        } else {
            System.out.println("Directory not exists, creating now");

            success = directory.mkdir();
            if (success) {
                System.out.printf("Successfully created new directory : %s%n", "dir");
            } else {
                System.out.printf("Failed to create new directory: %s%n", "dir");
            }
        }

        //create a new file only if it does NOT exist
        System.out.println("Enter file name to be created");
        String filename = reader.nextLine();

        File newFile = new File(filename);
            if (newFile.exists()) {
                System.out.println("File already exists!");
            } else {
                System.out.println("ok.. creating new file now.");
                success = newFile.createNewFile();
                if (success) {
                    System.out.printf("Successfully created new file: %s%n", newFile);
                } else {
                    System.out.printf("Failed to create new file: %s%n", newFile);
                }
            }
            reader.close();



        // System.out.println("x");
        // try {
        //     File file = new File("C:/User1/user1/Desktop", "test2.txt");
        //     file.createNewFile();
        //     System.out.println("Empty File Created:- " + file.length());
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
 
    }
}