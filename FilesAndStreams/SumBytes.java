package FilesAndStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SumBytes {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Damqn\\Desktop\\trash\\soft-uni\\SoftUniAdvanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedReader reader = Files.newBufferedReader(Paths.get(path));

        int sum = 0;

        String line = reader.readLine();
        while (line != null){
            for(int i = 0 ; i < line.length(); i++){
                sum += line.charAt(i);
            }
            line = reader.readLine();
        }
        System.out.println(sum);
    }
}
