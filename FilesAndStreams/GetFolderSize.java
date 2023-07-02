package FilesAndStreams;

import java.io.File;
import java.nio.file.Files;

public class GetFolderSize {
    public static void main(String[] args) {
        String path = "C:\\Users\\Damqn\\Desktop\\trash\\soft-uni\\SoftUniAdvanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        File folder = new File(path);
        int sum = 0;


        File[] allFiles = folder.listFiles();

        for(File F : allFiles){
            sum += F.length();
        }

        System.out.println("Folder size: " + sum);

    }
}
