package FilesAndStreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ConsumerPrint {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Damqn\\Desktop\\trash\\soft-uni\\SoftUniAdvanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedReader reader = new BufferedReader(new FileReader(path));

        String line  = reader.readLine();

        while (line != null){
            int sum = 0;
            for(int i = 0; i < line.length(); i++){
                sum += line.charAt(i);
            }

            System.out.println(sum);


            line = reader.readLine();
        }
    }
}
