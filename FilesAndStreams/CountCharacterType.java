package FilesAndStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountCharacterType {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Damqn\\Desktop\\trash\\soft-uni\\SoftUniAdvanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> allLines = Files.readAllLines(Path.of(path));
        Set<Character> vowels = new HashSet<>();
        Set<Character> punctuation = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');


        punctuation.add('.');
        punctuation.add(',');
        punctuation.add('?');
        punctuation.add('!');

        int vowelsCount = 0;
        int punctuationCount = 0;
        int otherCount = 0;

        for(String s : allLines){
            for(int i = 0 ; i < s.length() ;i++){
                if(s.charAt(i) != ' '){
                    if(vowels.contains(s.charAt(i))){
                        vowelsCount++;
                    }else if(punctuation.contains(s.charAt(i))){
                        punctuationCount++;
                    }else {
                        otherCount++;
                    }
                }
            }
        }

        System.out.println("Vowels: " +vowelsCount);
        System.out.println("Other symbols: " +otherCount);
        System.out.println("Punctuation: " +punctuationCount);

    }
}
