import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner fileScanner = null; 

        System.out.println("Hello World!");

        FileInputStream fileInputStream; 
        FileOutputStream fileOutputStream; 
        PrintWriter fileWriter = null; 

        try {
            fileInputStream = new FileInputStream("input.txt");
            fileScanner = new Scanner(fileInputStream); 
            System.out.println("Opened input.txt file.");

            fileOutputStream = new FileOutputStream("output.txt");
            fileWriter = new PrintWriter(fileOutputStream); 
            System.out.println("Opened output.txt file.");

            String input = fileScanner.nextLine();
            
            fileWriter.println(input); 
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        if (fileScanner != null){
            fileScanner.close();
            System.out.println("Closed input.txt");
        }
        
        if (fileWriter != null){
            fileWriter.close();
            System.out.println("Closed output.txt");
        }
    }
}