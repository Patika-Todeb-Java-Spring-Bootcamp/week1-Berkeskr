import java.io.FileWriter;
import java.io.IOException;

public class Producer {

    public Producer(String input) {

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
