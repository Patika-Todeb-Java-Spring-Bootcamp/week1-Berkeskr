import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Producer {
    public static void main(String[] args) {
        String input = "Exit";
        System.out.println("Enter a match score");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        while(!input.matches("\\w+\\s\\d+\\-\\d+\\s\\w+")){
            System.out.println("Please enter a valid score!");
            input = scanner.nextLine();
        }
        try {
            FileWriter fileWriter = new FileWriter("input.txt");


            if (input.equalsIgnoreCase("exit")){
                fileWriter.write("Terminated...");
            }else{
                fileWriter.write(input);
            }

            fileWriter.close();
            //System.out.println("Success");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
