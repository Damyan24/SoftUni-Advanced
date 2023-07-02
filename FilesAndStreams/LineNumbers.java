package FilesAndStreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineNumbers {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Damqn\\Desktop\\trash\\soft-uni\\SoftUniAdvanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        List<String> lines = Files.readAllLines(Path.of(path));
        int count = 1;
        for(String s : lines){
            bw.write(count+". " + s);
            bw.newLine();
            count++;
        }

        bw.close();
    }
}
