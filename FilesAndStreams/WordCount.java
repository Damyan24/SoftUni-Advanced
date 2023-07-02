package FilesAndStreams;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class WordCount {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Damqn\\Desktop\\trash\\soft-uni\\SoftUniAdvanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        List<String> words = Files.readAllLines(Path.of(path));
        HashMap<String,Integer> occurences = new HashMap<>();
        for(String s : words){
            String [] line = s.split(" ");

            for(int i = 0 ; i < line.length;i++){
                occurences.put(line[i],0);
            }

            String path1 = "C:\\Users\\Damqn\\Desktop\\trash\\soft-uni\\SoftUniAdvanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";

            List<String> lines = Files.readAllLines(Path.of(path1));

            for(String str : lines){
                String[]row = str.split(" ");

                for(int i =0; i < row.length; i++){
                    if(occurences.containsKey(row[i])){
                        occurences.put(row[i],occurences.get(row[i])+1);
                    }
                }
            }


        }

        PrintWriter writer = new PrintWriter("results.txt");
        occurences.entrySet().stream().sorted((e1, e2)-> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> writer.println(entry.getKey() + " - " + entry.getValue()) );

        writer.close();
    }
}
