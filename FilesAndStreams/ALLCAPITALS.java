package FilesAndStreams;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ALLCAPITALS {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Damqn\\Desktop\\trash\\soft-uni\\SoftUniAdvanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));


        List<String> lines = Files.readAllLines(Path.of(path));

        for(String s : lines){
            bw.write(s.toUpperCase());
            bw.newLine();
        }
        bw.close();



    }
}
