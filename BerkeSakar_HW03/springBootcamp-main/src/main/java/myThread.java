import java.util.Scanner;

public class myThread extends Thread {

    @Override
    public void run() {
        String input = "Exit";

        do {
            System.out.println("Enter a match score");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
            while(!input.matches("\\w+\\s\\d+\\-\\d+\\s\\w+|exit|Exit")){
                System.out.println("Please enter a valid score!");
                input = scanner.nextLine();
            }
            Producer producer = new Producer(input);
            Consumer consumer = new Consumer(input);
        } while (!input.equalsIgnoreCase("exit"));

    }
}
