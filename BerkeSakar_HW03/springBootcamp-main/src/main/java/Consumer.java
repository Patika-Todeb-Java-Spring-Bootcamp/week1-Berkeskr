import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Consumer {
    
    public Consumer(String input) {
        File file = new File("input.txt");
        Scanner scanner= null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {

            input = scanner.nextLine();
            System.out.println(input);
        }

    }
}
