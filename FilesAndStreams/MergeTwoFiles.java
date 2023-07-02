package FilesAndStreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        String path1 = "C:\\Users\\Damqn\\Desktop\\trash\\soft-uni\\SoftUniAdvanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String path2 = "C:\\Users\\Damqn\\Desktop\\trash\\soft-uni\\SoftUniAdvanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";

        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

        List<String> nums1 = Files.readAllLines(Path.of(path1));
        List<String> nums2 = Files.readAllLines(Path.of(path2));

        for(String s1 : nums1){
            bw.write(s1);
            bw.newLine();
        }

        for(String s2 : nums2){
            bw.write(s2);
            bw.newLine();
        }

        bw.close();


    }
}
