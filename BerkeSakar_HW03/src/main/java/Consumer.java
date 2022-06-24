import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Consumer extends Thread{

    @Override
    public void run() {
        synchronized (this){
            consumerRun();
        }


    }

    public synchronized void consumerRun() {
        File file = new File("input.txt");
        Scanner scanner= null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {

            String input = scanner.nextLine();
            System.out.println(input);


        }

    }
}
